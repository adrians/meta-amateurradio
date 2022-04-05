SUMMARY = "kalibrate-rtl"

DESCRIPTION = "Kalibrate, or kal, can scan for GSM base stations in a given \
frequency band and can use those GSM base stations to calculate the local \
oscillator frequency offset."

HOMEPAGE = "https://github.com/steve-m/kalibrate-rtl"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${S}/COPYING;md5=0eae42b21c81e0e7c8c3e8a545e156c9"

DEPENDS = "fftw rtlsdr"

SRCREV = "66074b82daf4a1c588ce1c565a145fac1c59ec56"
SRC_URI = "git://github.com/steve-m/kalibrate-rtl.git;protocol=https;branch=master \
          "
S = "${WORKDIR}/git"

inherit autotools pkgconfig
