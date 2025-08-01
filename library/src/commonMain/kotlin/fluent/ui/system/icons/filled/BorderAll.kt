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

public val FluentIcons.Filled.BorderAll: ImageVector
    get() {
        if (_BorderAll != null) {
            return _BorderAll!!
        }
        _BorderAll = ImageVector.Builder(
            name = "Filled.BorderAll",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 6f)
                curveTo(3f, 4.343f, 4.343f, 3f, 6f, 3f)
                horizontalLineTo(18f)
                curveTo(19.657f, 3f, 21f, 4.343f, 21f, 6f)
                verticalLineTo(18f)
                curveTo(21f, 19.657f, 19.657f, 21f, 18f, 21f)
                horizontalLineTo(6f)
                curveTo(4.343f, 21f, 3f, 19.657f, 3f, 18f)
                verticalLineTo(6f)
                close()
                moveTo(13f, 19f)
                horizontalLineTo(18f)
                curveTo(18.552f, 19f, 19f, 18.552f, 19f, 18f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                close()
                moveTo(11f, 13f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                curveTo(5f, 18.552f, 5.448f, 19f, 6f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                close()
                moveTo(13f, 11f)
                horizontalLineTo(19f)
                verticalLineTo(6f)
                curveTo(19f, 5.448f, 18.552f, 5f, 18f, 5f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                close()
                moveTo(11f, 5f)
                horizontalLineTo(6f)
                curveTo(5.448f, 5f, 5f, 5.448f, 5f, 6f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _BorderAll!!
    }

@Suppress("ObjectPropertyName")
private var _BorderAll: ImageVector? = null

@Preview
@Composable
private fun BorderAllPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BorderAll, contentDescription = null)
    }
}
