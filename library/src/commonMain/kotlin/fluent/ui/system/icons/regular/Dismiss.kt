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

public val FluentIcons.Regular.Dismiss: ImageVector
    get() {
        if (_Dismiss != null) {
            return _Dismiss!!
        }
        _Dismiss = ImageVector.Builder(
            name = "Regular.Dismiss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.397f, 4.554f)
                lineTo(4.47f, 4.47f)
                curveTo(4.736f, 4.203f, 5.153f, 4.179f, 5.446f, 4.397f)
                lineTo(5.53f, 4.47f)
                lineTo(12f, 10.939f)
                lineTo(18.47f, 4.47f)
                curveTo(18.763f, 4.177f, 19.237f, 4.177f, 19.53f, 4.47f)
                curveTo(19.823f, 4.763f, 19.823f, 5.237f, 19.53f, 5.53f)
                lineTo(13.061f, 12f)
                lineTo(19.53f, 18.47f)
                curveTo(19.797f, 18.736f, 19.821f, 19.153f, 19.603f, 19.446f)
                lineTo(19.53f, 19.53f)
                curveTo(19.264f, 19.797f, 18.847f, 19.821f, 18.554f, 19.603f)
                lineTo(18.47f, 19.53f)
                lineTo(12f, 13.061f)
                lineTo(5.53f, 19.53f)
                curveTo(5.237f, 19.823f, 4.763f, 19.823f, 4.47f, 19.53f)
                curveTo(4.177f, 19.237f, 4.177f, 18.763f, 4.47f, 18.47f)
                lineTo(10.939f, 12f)
                lineTo(4.47f, 5.53f)
                curveTo(4.203f, 5.264f, 4.179f, 4.847f, 4.397f, 4.554f)
                lineTo(4.47f, 4.47f)
                lineTo(4.397f, 4.554f)
                close()
            }
        }.build()

        return _Dismiss!!
    }

@Suppress("ObjectPropertyName")
private var _Dismiss: ImageVector? = null

@Preview
@Composable
private fun DismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Dismiss, contentDescription = null)
    }
}
