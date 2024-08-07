plugins {
	alias(libs.plugins.springboot.framework)
	alias(libs.plugins.springboot.dep.management)
	alias(libs.plugins.kotlin.jvm)
	alias(libs.plugins.kotlin.spring)
}

group = "dev.vmillet"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation(libs.springboot.logging)
	implementation(libs.springboot.tomcat)
	implementation(libs.spring.autoconfigure)
	implementation(libs.spring.datajpa)
	implementation(libs.spring.webmvc)
	implementation(libs.spring.websocket)
	implementation(libs.spring.messaging)
	implementation(libs.fasterxml.jackson)
	implementation(libs.kotlin.reflect)
	implementation(libs.jakarta.persistence)
	implementation(libs.hibernate.core)
	implementation(libs.yaml.snakeyaml)
	implementation(libs.zaxxer.hikaricp)
	runtimeOnly(libs.postgresql)

	testImplementation(libs.springboot.test)
	testImplementation(libs.kotlin.test)
	testImplementation(libs.h2.database)
	testRuntimeOnly(libs.junit.plateform.launcher)
}

kotlin {
	compilerOptions {
		freeCompilerArgs.addAll("-Xjsr305=strict")
	}
}

sourceSets {
	main {
		java.srcDirs("backend/main/kotlin")
		resources.srcDirs("backend/main/resources")
	}

	test {
		java.srcDirs("backend/test/kotlin")
		resources.srcDirs("backend/test/resources")
	}
}

tasks.processResources  {
	from("frontend/dist/browser") {
		into("static")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
