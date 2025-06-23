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

public val FluentIcons.Filled.ArrowAutofitHeightIn: ImageVector
    get() {
        if (_ArrowAutofitHeightIn != null) {
            return _ArrowAutofitHeightIn!!
        }
        _ArrowAutofitHeightIn = ImageVector.Builder(
            name = "Filled.ArrowAutofitHeightIn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.957f, 10.207f)
                lineTo(19.457f, 7.707f)
                curveTo(19.848f, 7.317f, 19.848f, 6.683f, 19.457f, 6.293f)
                curveTo(19.067f, 5.902f, 18.433f, 5.902f, 18.043f, 6.293f)
                lineTo(17.25f, 7.086f)
                verticalLineTo(4f)
                curveTo(17.25f, 3.448f, 16.802f, 3f, 16.25f, 3f)
                curveTo(15.698f, 3f, 15.25f, 3.448f, 15.25f, 4f)
                verticalLineTo(7.086f)
                lineTo(14.457f, 6.293f)
                curveTo(14.067f, 5.902f, 13.433f, 5.902f, 13.043f, 6.293f)
                curveTo(12.652f, 6.683f, 12.652f, 7.317f, 13.043f, 7.707f)
                lineTo(15.543f, 10.207f)
                curveTo(15.933f, 10.598f, 16.567f, 10.598f, 16.957f, 10.207f)
                close()
                moveTo(4f, 6.5f)
                curveTo(4f, 5.119f, 5.119f, 4f, 6.5f, 4f)
                horizontalLineTo(10.5f)
                curveTo(11.052f, 4f, 11.5f, 4.448f, 11.5f, 5f)
                curveTo(11.5f, 5.552f, 11.052f, 6f, 10.5f, 6f)
                horizontalLineTo(6.5f)
                curveTo(6.224f, 6f, 6f, 6.224f, 6f, 6.5f)
                verticalLineTo(17.5f)
                curveTo(6f, 17.776f, 6.224f, 18f, 6.5f, 18f)
                horizontalLineTo(10.5f)
                curveTo(11.052f, 18f, 11.5f, 18.448f, 11.5f, 19f)
                curveTo(11.5f, 19.552f, 11.052f, 20f, 10.5f, 20f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 20f, 4f, 18.881f, 4f, 17.5f)
                verticalLineTo(6.5f)
                close()
                moveTo(19.457f, 16.293f)
                lineTo(16.957f, 13.793f)
                curveTo(16.567f, 13.402f, 15.933f, 13.402f, 15.543f, 13.793f)
                lineTo(13.043f, 16.293f)
                curveTo(12.652f, 16.683f, 12.652f, 17.317f, 13.043f, 17.707f)
                curveTo(13.433f, 18.098f, 14.067f, 18.098f, 14.457f, 17.707f)
                lineTo(15.25f, 16.914f)
                verticalLineTo(20f)
                curveTo(15.25f, 20.552f, 15.698f, 21f, 16.25f, 21f)
                curveTo(16.802f, 21f, 17.25f, 20.552f, 17.25f, 20f)
                verticalLineTo(16.914f)
                lineTo(18.043f, 17.707f)
                curveTo(18.433f, 18.098f, 19.067f, 18.098f, 19.457f, 17.707f)
                curveTo(19.848f, 17.317f, 19.848f, 16.683f, 19.457f, 16.293f)
                close()
            }
        }.build()

        return _ArrowAutofitHeightIn!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowAutofitHeightIn: ImageVector? = null

@Preview
@Composable
private fun ArrowAutofitHeightInPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowAutofitHeightIn, contentDescription = null)
    }
}
