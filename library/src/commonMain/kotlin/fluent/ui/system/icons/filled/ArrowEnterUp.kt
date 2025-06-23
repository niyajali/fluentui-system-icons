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

public val FluentIcons.Filled.ArrowEnterUp: ImageVector
    get() {
        if (_ArrowEnterUp != null) {
            return _ArrowEnterUp!!
        }
        _ArrowEnterUp = ImageVector.Builder(
            name = "Filled.ArrowEnterUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20f, 21f)
                curveTo(20f, 21.513f, 19.614f, 21.935f, 19.117f, 21.993f)
                lineTo(19f, 22f)
                lineTo(12.5f, 22f)
                curveTo(10.631f, 22f, 9.105f, 20.536f, 9.005f, 18.692f)
                lineTo(9f, 18.5f)
                lineTo(9f, 5.415f)
                lineTo(5.707f, 8.707f)
                curveTo(5.347f, 9.068f, 4.779f, 9.095f, 4.387f, 8.79f)
                lineTo(4.293f, 8.707f)
                curveTo(3.932f, 8.347f, 3.905f, 7.779f, 4.21f, 7.387f)
                lineTo(4.293f, 7.293f)
                lineTo(9.293f, 2.293f)
                curveTo(9.328f, 2.257f, 9.366f, 2.225f, 9.405f, 2.196f)
                lineTo(9.516f, 2.125f)
                lineTo(9.629f, 2.071f)
                lineTo(9.734f, 2.036f)
                lineTo(9.852f, 2.011f)
                lineTo(9.91f, 2.004f)
                lineTo(10f, 2f)
                lineTo(10.075f, 2.003f)
                lineTo(10.201f, 2.02f)
                lineTo(10.312f, 2.05f)
                lineTo(10.423f, 2.094f)
                lineTo(10.521f, 2.146f)
                lineTo(10.613f, 2.21f)
                lineTo(10.707f, 2.293f)
                lineTo(15.707f, 7.293f)
                curveTo(16.098f, 7.683f, 16.098f, 8.317f, 15.707f, 8.707f)
                curveTo(15.347f, 9.068f, 14.779f, 9.095f, 14.387f, 8.79f)
                lineTo(14.293f, 8.707f)
                lineTo(11f, 5.415f)
                lineTo(11f, 18.5f)
                curveTo(11f, 19.28f, 11.595f, 19.92f, 12.356f, 19.993f)
                lineTo(12.5f, 20f)
                lineTo(19f, 20f)
                curveTo(19.552f, 20f, 20f, 20.448f, 20f, 21f)
                close()
            }
        }.build()

        return _ArrowEnterUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowEnterUp: ImageVector? = null

@Preview
@Composable
private fun ArrowEnterUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowEnterUp, contentDescription = null)
    }
}
