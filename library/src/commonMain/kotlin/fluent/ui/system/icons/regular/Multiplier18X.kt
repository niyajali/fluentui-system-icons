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

public val FluentIcons.Regular.Multiplier18X: ImageVector
    get() {
        if (_Multiplier18X != null) {
            return _Multiplier18X!!
        }
        _Multiplier18X = ImageVector.Builder(
            name = "Regular.Multiplier18X",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16f, 9.5f)
                curveTo(16f, 10.275f, 15.665f, 10.944f, 15.14f, 11.429f)
                curveTo(15.957f, 12.012f, 16.5f, 12.928f, 16.5f, 14f)
                curveTo(16.5f, 15.861f, 14.864f, 17.25f, 13f, 17.25f)
                curveTo(11.136f, 17.25f, 9.5f, 15.861f, 9.5f, 14f)
                curveTo(9.5f, 12.928f, 10.043f, 12.012f, 10.86f, 11.429f)
                curveTo(10.335f, 10.944f, 10f, 10.275f, 10f, 9.5f)
                curveTo(10f, 7.901f, 11.429f, 6.75f, 13f, 6.75f)
                curveTo(14.571f, 6.75f, 16f, 7.901f, 16f, 9.5f)
                close()
                moveTo(13f, 8.25f)
                curveTo(12.086f, 8.25f, 11.5f, 8.89f, 11.5f, 9.5f)
                curveTo(11.5f, 10.11f, 12.086f, 10.75f, 13f, 10.75f)
                curveTo(13.914f, 10.75f, 14.5f, 10.11f, 14.5f, 9.5f)
                curveTo(14.5f, 8.89f, 13.914f, 8.25f, 13f, 8.25f)
                close()
                moveTo(11f, 14f)
                curveTo(11f, 14.901f, 11.827f, 15.75f, 13f, 15.75f)
                curveTo(14.174f, 15.75f, 15f, 14.901f, 15f, 14f)
                curveTo(15f, 13.099f, 14.174f, 12.25f, 13f, 12.25f)
                curveTo(11.827f, 12.25f, 11f, 13.099f, 11f, 14f)
                close()
                moveTo(18.281f, 12.22f)
                curveTo(17.988f, 11.927f, 17.513f, 11.927f, 17.22f, 12.22f)
                curveTo(16.927f, 12.512f, 16.927f, 12.987f, 17.22f, 13.28f)
                lineTo(18.439f, 14.5f)
                lineTo(17.22f, 15.72f)
                curveTo(16.927f, 16.013f, 16.927f, 16.487f, 17.22f, 16.78f)
                curveTo(17.513f, 17.073f, 17.988f, 17.073f, 18.281f, 16.78f)
                lineTo(19.5f, 15.561f)
                lineTo(20.72f, 16.78f)
                curveTo(21.013f, 17.073f, 21.487f, 17.073f, 21.78f, 16.78f)
                curveTo(22.073f, 16.487f, 22.073f, 16.013f, 21.78f, 15.72f)
                lineTo(20.561f, 14.5f)
                lineTo(21.78f, 13.28f)
                curveTo(22.073f, 12.987f, 22.073f, 12.512f, 21.78f, 12.22f)
                curveTo(21.487f, 11.927f, 21.013f, 11.927f, 20.72f, 12.22f)
                lineTo(19.5f, 13.439f)
                lineTo(18.281f, 12.22f)
                close()
                moveTo(8.5f, 16.25f)
                curveTo(8.5f, 16.664f, 8.164f, 17f, 7.75f, 17f)
                curveTo(7.336f, 17f, 7f, 16.664f, 7f, 16.25f)
                curveTo(7f, 15.836f, 7.336f, 15.5f, 7.75f, 15.5f)
                curveTo(8.164f, 15.5f, 8.5f, 15.836f, 8.5f, 16.25f)
                close()
                moveTo(5.453f, 7.028f)
                curveTo(5.776f, 7.119f, 6f, 7.414f, 6f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(6f, 16.664f, 5.664f, 17f, 5.25f, 17f)
                curveTo(4.836f, 17f, 4.5f, 16.664f, 4.5f, 16.25f)
                verticalLineTo(9.833f)
                curveTo(4.118f, 10.202f, 3.66f, 10.579f, 3.136f, 10.893f)
                curveTo(2.781f, 11.106f, 2.32f, 10.991f, 2.107f, 10.636f)
                curveTo(1.894f, 10.281f, 2.009f, 9.82f, 2.364f, 9.607f)
                curveTo(3.04f, 9.202f, 3.604f, 8.642f, 4.006f, 8.168f)
                curveTo(4.205f, 7.933f, 4.36f, 7.726f, 4.463f, 7.579f)
                curveTo(4.514f, 7.506f, 4.553f, 7.448f, 4.577f, 7.41f)
                curveTo(4.59f, 7.391f, 4.599f, 7.377f, 4.604f, 7.369f)
                lineTo(4.609f, 7.36f)
                lineTo(4.61f, 7.359f)
                curveTo(4.785f, 7.072f, 5.129f, 6.937f, 5.453f, 7.028f)
                close()
            }
        }.build()

        return _Multiplier18X!!
    }

@Suppress("ObjectPropertyName")
private var _Multiplier18X: ImageVector? = null

@Preview
@Composable
private fun Multiplier18XPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Multiplier18X, contentDescription = null)
    }
}
