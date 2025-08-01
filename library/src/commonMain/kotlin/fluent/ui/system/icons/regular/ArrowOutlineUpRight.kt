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

public val FluentIcons.Regular.ArrowOutlineUpRight: ImageVector
    get() {
        if (_ArrowOutlineUpRight != null) {
            return _ArrowOutlineUpRight!!
        }
        _ArrowOutlineUpRight = ImageVector.Builder(
            name = "Regular.ArrowOutlineUpRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.495f, 4f)
                curveTo(20.527f, 3.713f, 20.285f, 3.471f, 19.998f, 3.503f)
                lineTo(7.937f, 4.843f)
                curveTo(7.562f, 4.885f, 7.401f, 5.342f, 7.668f, 5.609f)
                lineTo(9.466f, 7.406f)
                curveTo(9.759f, 7.699f, 9.759f, 8.174f, 9.466f, 8.467f)
                lineTo(3.632f, 14.301f)
                curveTo(3.456f, 14.477f, 3.456f, 14.762f, 3.632f, 14.938f)
                lineTo(9.061f, 20.367f)
                curveTo(9.237f, 20.542f, 9.522f, 20.542f, 9.697f, 20.367f)
                lineTo(15.531f, 14.533f)
                curveTo(15.824f, 14.24f, 16.299f, 14.24f, 16.592f, 14.533f)
                lineTo(18.389f, 16.33f)
                curveTo(18.656f, 16.597f, 19.113f, 16.437f, 19.155f, 16.062f)
                lineTo(20.495f, 4f)
                close()
                moveTo(19.833f, 2.012f)
                curveTo(21.074f, 1.874f, 22.124f, 2.924f, 21.986f, 4.166f)
                lineTo(20.646f, 16.227f)
                curveTo(20.465f, 17.852f, 18.485f, 18.547f, 17.329f, 17.391f)
                lineTo(16.062f, 16.124f)
                lineTo(10.758f, 21.427f)
                curveTo(9.996f, 22.189f, 8.762f, 22.189f, 8f, 21.427f)
                lineTo(2.571f, 15.998f)
                curveTo(1.81f, 15.237f, 1.81f, 14.002f, 2.571f, 13.24f)
                lineTo(7.875f, 7.937f)
                lineTo(6.607f, 6.669f)
                curveTo(5.451f, 5.513f, 6.146f, 3.533f, 7.771f, 3.352f)
                lineTo(19.833f, 2.012f)
                close()
            }
        }.build()

        return _ArrowOutlineUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowOutlineUpRight: ImageVector? = null

@Preview
@Composable
private fun ArrowOutlineUpRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowOutlineUpRight, contentDescription = null)
    }
}
