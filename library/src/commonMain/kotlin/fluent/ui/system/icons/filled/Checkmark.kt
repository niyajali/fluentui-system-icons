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

public val FluentIcons.Filled.Checkmark: ImageVector
    get() {
        if (_Checkmark != null) {
            return _Checkmark!!
        }
        _Checkmark = ImageVector.Builder(
            name = "Filled.Checkmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.5f, 16.586f)
                lineTo(4.707f, 12.793f)
                curveTo(4.317f, 12.402f, 3.683f, 12.402f, 3.293f, 12.793f)
                curveTo(2.902f, 13.183f, 2.902f, 13.817f, 3.293f, 14.207f)
                lineTo(7.793f, 18.707f)
                curveTo(8.183f, 19.098f, 8.817f, 19.098f, 9.207f, 18.707f)
                lineTo(20.207f, 7.707f)
                curveTo(20.598f, 7.317f, 20.598f, 6.683f, 20.207f, 6.293f)
                curveTo(19.817f, 5.902f, 19.183f, 5.902f, 18.793f, 6.293f)
                lineTo(8.5f, 16.586f)
                close()
            }
        }.build()

        return _Checkmark!!
    }

@Suppress("ObjectPropertyName")
private var _Checkmark: ImageVector? = null

@Preview
@Composable
private fun CheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Checkmark, contentDescription = null)
    }
}
