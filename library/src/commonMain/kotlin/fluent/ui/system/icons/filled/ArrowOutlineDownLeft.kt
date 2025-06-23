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
package fluent.ui.system.icons.filled

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

public val FluentIcons.Filled.ArrowOutlineDownLeft: ImageVector
    get() {
        if (_ArrowOutlineDownLeft != null) {
            return _ArrowOutlineDownLeft!!
        }
        _ArrowOutlineDownLeft = ImageVector.Builder(
            name = "Filled.ArrowOutlineDownLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.166f, 21.986f)
                curveTo(2.924f, 22.124f, 1.874f, 21.075f, 2.012f, 19.833f)
                lineTo(3.352f, 7.771f)
                curveTo(3.533f, 6.146f, 5.513f, 5.451f, 6.669f, 6.608f)
                lineTo(7.937f, 7.875f)
                lineTo(13.24f, 2.571f)
                curveTo(14.002f, 1.81f, 15.236f, 1.81f, 15.998f, 2.571f)
                lineTo(21.427f, 8f)
                curveTo(22.188f, 8.762f, 22.188f, 9.996f, 21.427f, 10.758f)
                lineTo(16.123f, 16.062f)
                lineTo(17.391f, 17.329f)
                curveTo(18.547f, 18.485f, 17.852f, 20.465f, 16.227f, 20.646f)
                lineTo(4.166f, 21.986f)
                close()
            }
        }.build()

        return _ArrowOutlineDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowOutlineDownLeft: ImageVector? = null

@Preview
@Composable
private fun ArrowOutlineDownLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowOutlineDownLeft, contentDescription = null)
    }
}
