SRC_URI = "git://github.com/go-gitea/gitea;protocol=https;branch=release/v1.18 \
        "
SRCREV = "48eb5ac6856aeed5b6501fcd27899d3dc3da2876"
S = "${WORKDIR}/git"

LICENSE = "MIT"

DEPENDS = "go-native nodejs-native"

inherit autotools-brokensep

do_compile[network] = "1"

LIC_FILES_CHKSUM = "file://LICENSE;md5=50cdba183b290a790b4fcb753444ac85"

export CGO_ENABLED = "1"
export LDFLAGS = ""
export GOOS = "linux"
export GOARCH = "arm64"

do_compile () {
    TAGS="bindata sqlite" oe_runmake frontend

    TAGS="bindata sqlite" oe_runmake generate

    TAGS="bindata sqlite" oe_runmake backend
}
