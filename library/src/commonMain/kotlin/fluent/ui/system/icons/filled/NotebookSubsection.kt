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

public val FluentIcons.Filled.NotebookSubsection: ImageVector
    get() {
        if (_NotebookSubsection != null) {
            return _NotebookSubsection!!
        }
        _NotebookSubsection = ImageVector.Builder(
            name = "Filled.NotebookSubsection",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9f, 2f)
                curveTo(6.515f, 2f, 4.5f, 4.015f, 4.5f, 6.5f)
                verticalLineTo(15.9f)
                curveTo(4.5f, 16.88f, 5.126f, 17.713f, 6f, 18.022f)
                verticalLineTo(6.5f)
                curveTo(6f, 4.843f, 7.343f, 3.5f, 9f, 3.5f)
                horizontalLineTo(14.002f)
                curveTo(13.693f, 2.626f, 12.86f, 2f, 11.88f, 2f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7f, 6.75f)
                curveTo(7f, 5.507f, 8.007f, 4.5f, 9.25f, 4.5f)
                horizontalLineTo(15f)
                verticalLineTo(2.75f)
                curveTo(15f, 2.336f, 15.336f, 2f, 15.75f, 2f)
                curveTo(16.164f, 2f, 16.5f, 2.336f, 16.5f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(16.5f, 21.664f, 16.164f, 22f, 15.75f, 22f)
                curveTo(15.336f, 22f, 15f, 21.664f, 15f, 21.25f)
                verticalLineTo(20f)
                horizontalLineTo(9.25f)
                curveTo(8.007f, 20f, 7f, 18.993f, 7f, 17.75f)
                verticalLineTo(6.75f)
                close()
            }
        }.build()

        return _NotebookSubsection!!
    }

@Suppress("ObjectPropertyName")
private var _NotebookSubsection: ImageVector? = null

@Preview
@Composable
private fun NotebookSubsectionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.NotebookSubsection, contentDescription = null)
    }
}
