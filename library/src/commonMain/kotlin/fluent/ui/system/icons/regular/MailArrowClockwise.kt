/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.MailArrowClockwise: ImageVector
    get() {
        if (_MailArrowClockwise != null) {
            return _MailArrowClockwise!!
        }
        _MailArrowClockwise = ImageVector.Builder(
            name = "Regular.MailArrowClockwise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(23f, 0.75f)
                curveTo(23f, 0.336f, 22.664f, 0f, 22.25f, 0f)
                curveTo(21.836f, 0f, 21.5f, 0.336f, 21.5f, 0.75f)
                verticalLineTo(1.376f)
                curveTo(20.515f, 0.668f, 19.305f, 0.25f, 18f, 0.25f)
                curveTo(14.686f, 0.25f, 12f, 2.936f, 12f, 6.25f)
                curveTo(12f, 9.564f, 14.686f, 12.25f, 18f, 12.25f)
                curveTo(21.314f, 12.25f, 24f, 9.564f, 24f, 6.25f)
                curveTo(24f, 5.836f, 23.664f, 5.5f, 23.25f, 5.5f)
                curveTo(22.836f, 5.5f, 22.5f, 5.836f, 22.5f, 6.25f)
                curveTo(22.5f, 8.735f, 20.485f, 10.75f, 18f, 10.75f)
                curveTo(15.515f, 10.75f, 13.5f, 8.735f, 13.5f, 6.25f)
                curveTo(13.5f, 3.765f, 15.515f, 1.75f, 18f, 1.75f)
                curveTo(19.065f, 1.75f, 20.042f, 2.119f, 20.812f, 2.737f)
                curveTo(20.815f, 2.739f, 20.817f, 2.741f, 20.82f, 2.743f)
                curveTo(20.823f, 2.745f, 20.826f, 2.748f, 20.829f, 2.75f)
                horizontalLineTo(19.5f)
                curveTo(19.086f, 2.75f, 18.75f, 3.086f, 18.75f, 3.5f)
                curveTo(18.75f, 3.914f, 19.086f, 4.25f, 19.5f, 4.25f)
                horizontalLineTo(22.25f)
                curveTo(22.664f, 4.25f, 23f, 3.914f, 23f, 3.5f)
                verticalLineTo(0.75f)
                close()
                moveTo(22f, 16.75f)
                verticalLineTo(11.995f)
                curveTo(21.538f, 12.318f, 21.035f, 12.586f, 20.5f, 12.79f)
                verticalLineTo(16.75f)
                lineTo(20.494f, 16.893f)
                curveTo(20.421f, 17.793f, 19.668f, 18.5f, 18.75f, 18.5f)
                horizontalLineTo(5.25f)
                lineTo(5.106f, 18.494f)
                curveTo(4.207f, 18.421f, 3.5f, 17.668f, 3.5f, 16.75f)
                verticalLineTo(9.374f)
                lineTo(11.651f, 13.664f)
                lineTo(11.747f, 13.706f)
                curveTo(11.943f, 13.776f, 12.162f, 13.762f, 12.349f, 13.664f)
                lineTo(14.701f, 12.426f)
                curveTo(14.202f, 12.158f, 13.739f, 11.832f, 13.321f, 11.457f)
                lineTo(12f, 12.153f)
                lineTo(3.5f, 7.679f)
                verticalLineTo(7.25f)
                lineTo(3.506f, 7.106f)
                curveTo(3.579f, 6.207f, 4.332f, 5.5f, 5.25f, 5.5f)
                horizontalLineTo(11.04f)
                curveTo(11.095f, 4.981f, 11.207f, 4.479f, 11.37f, 4f)
                horizontalLineTo(5.25f)
                lineTo(5.066f, 4.005f)
                curveTo(3.356f, 4.101f, 2f, 5.517f, 2f, 7.25f)
                verticalLineTo(16.75f)
                lineTo(2.005f, 16.934f)
                curveTo(2.101f, 18.643f, 3.517f, 20f, 5.25f, 20f)
                horizontalLineTo(18.75f)
                lineTo(18.934f, 19.995f)
                curveTo(20.643f, 19.899f, 22f, 18.483f, 22f, 16.75f)
                close()
            }
        }.build()

        return _MailArrowClockwise!!
    }

@Suppress("ObjectPropertyName")
private var _MailArrowClockwise: ImageVector? = null

@Preview
@Composable
private fun MailArrowClockwisePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MailArrowClockwise, contentDescription = null)
    }
}
