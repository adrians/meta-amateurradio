SUMMARY = "Direwolf APRS decoder"

DESCRIPTION = "Dire Wolf is a software 'soundcard' AX.25 packet modem/TNC and \
APRS encoder/decoder. It can be used stand-alone to observe APRS traffic, as a \
tracker, digipeater, APRStt gateway, or Internet Gateway (IGate)."

HOMEPAGE = "https://github.com/wb2osz/direwolf/"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fa22e16ebbe6638b2bd253338fbded9f"

SRC_URI = "git://github.com/wb2osz/direwolf.git;protocol=git;branch=master \
          "

SRCREV = "413855e7915865db998239e8383cb7f84d5ac1bd"

S = "${WORKDIR}/git"

DEPENDS = "alsa-lib udev"
RDEPENDS:${PN} = "bash perl"

inherit cmake

do_install:append() {
	rm -f ${D}/usr/bin/telem-volts.py
}
