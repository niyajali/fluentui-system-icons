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

public val FluentIcons.Regular.ClipboardMathFormula: ImageVector
    get() {
        if (_ClipboardMathFormula != null) {
            return _ClipboardMathFormula!!
        }
        _ClipboardMathFormula = ImageVector.Builder(
            name = "Regular.ClipboardMathFormula",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.379f, 5.5f)
                horizontalLineTo(6.25f)
                curveTo(5.836f, 5.5f, 5.5f, 5.836f, 5.5f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(5.5f, 20.164f, 5.836f, 20.5f, 6.25f, 20.5f)
                horizontalLineTo(11.97f)
                curveTo(11.639f, 20.665f, 11.357f, 20.935f, 11.181f, 21.292f)
                curveTo(11.068f, 21.521f, 11.01f, 21.761f, 11.001f, 22f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
                horizontalLineTo(8.014f)
                curveTo(8.138f, 2.875f, 9.092f, 2f, 10.25f, 2f)
                horizontalLineTo(13.75f)
                curveTo(14.908f, 2f, 15.862f, 2.875f, 15.986f, 4f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
                verticalLineTo(13f)
                horizontalLineTo(19.997f)
                curveTo(20.022f, 12.331f, 19.661f, 11.678f, 19.022f, 11.363f)
                curveTo(18.85f, 11.278f, 18.675f, 11.209f, 18.5f, 11.154f)
                verticalLineTo(6.25f)
                curveTo(18.5f, 5.836f, 18.164f, 5.5f, 17.75f, 5.5f)
                horizontalLineTo(15.621f)
                curveTo(15.217f, 6.103f, 14.53f, 6.5f, 13.75f, 6.5f)
                horizontalLineTo(10.25f)
                curveTo(9.47f, 6.5f, 8.783f, 6.103f, 8.379f, 5.5f)
                close()
                moveTo(9.5f, 4.25f)
                curveTo(9.5f, 4.664f, 9.836f, 5f, 10.25f, 5f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 5f, 14.5f, 4.664f, 14.5f, 4.25f)
                curveTo(14.5f, 3.836f, 14.164f, 3.5f, 13.75f, 3.5f)
                horizontalLineTo(10.25f)
                curveTo(9.836f, 3.5f, 9.5f, 3.836f, 9.5f, 4.25f)
                close()
                moveTo(21.777f, 18.28f)
                curveTo(22.07f, 17.987f, 22.07f, 17.513f, 21.777f, 17.22f)
                curveTo(21.484f, 16.927f, 21.009f, 16.927f, 20.716f, 17.22f)
                lineTo(19.633f, 18.303f)
                lineTo(19.212f, 17.626f)
                curveTo(18.807f, 16.974f, 17.934f, 16.802f, 17.312f, 17.251f)
                curveTo(16.976f, 17.493f, 16.899f, 17.962f, 17.142f, 18.298f)
                curveTo(17.347f, 18.582f, 17.713f, 18.68f, 18.025f, 18.557f)
                lineTo(18.544f, 19.392f)
                lineTo(17.22f, 20.716f)
                curveTo(16.927f, 21.009f, 16.927f, 21.484f, 17.22f, 21.777f)
                curveTo(17.513f, 22.07f, 17.987f, 22.07f, 18.28f, 21.777f)
                lineTo(19.358f, 20.7f)
                lineTo(19.779f, 21.378f)
                curveTo(20.191f, 22.04f, 21.084f, 22.203f, 21.704f, 21.729f)
                curveTo(22.033f, 21.478f, 22.096f, 21.007f, 21.844f, 20.678f)
                curveTo(21.633f, 20.402f, 21.269f, 20.313f, 20.963f, 20.44f)
                lineTo(20.447f, 19.611f)
                lineTo(21.777f, 18.28f)
                close()
                moveTo(14.989f, 14.307f)
                curveTo(15.123f, 12.546f, 16.995f, 11.478f, 18.579f, 12.26f)
                curveTo(18.951f, 12.443f, 19.103f, 12.893f, 18.92f, 13.264f)
                curveTo(18.737f, 13.636f, 18.287f, 13.788f, 17.916f, 13.605f)
                curveTo(17.285f, 13.294f, 16.538f, 13.719f, 16.485f, 14.421f)
                lineTo(16.441f, 15f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 15f, 18f, 15.336f, 18f, 15.75f)
                curveTo(18f, 16.164f, 17.664f, 16.5f, 17.25f, 16.5f)
                horizontalLineTo(16.327f)
                lineTo(16.008f, 20.692f)
                curveTo(15.874f, 22.453f, 14.002f, 23.521f, 12.418f, 22.739f)
                curveTo(12.047f, 22.556f, 11.894f, 22.106f, 12.078f, 21.735f)
                curveTo(12.261f, 21.363f, 12.71f, 21.211f, 13.082f, 21.394f)
                curveTo(13.713f, 21.705f, 14.459f, 21.28f, 14.513f, 20.578f)
                lineTo(14.823f, 16.5f)
                horizontalLineTo(13.75f)
                curveTo(13.336f, 16.5f, 13f, 16.164f, 13f, 15.75f)
                curveTo(13f, 15.336f, 13.336f, 15f, 13.75f, 15f)
                horizontalLineTo(14.937f)
                lineTo(14.989f, 14.307f)
                close()
            }
        }.build()

        return _ClipboardMathFormula!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardMathFormula: ImageVector? = null

@Preview
@Composable
private fun ClipboardMathFormulaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ClipboardMathFormula, contentDescription = null)
    }
}
