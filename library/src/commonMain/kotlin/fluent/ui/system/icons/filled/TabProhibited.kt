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

public val FluentIcons.Filled.TabProhibited: ImageVector
    get() {
        if (_TabProhibited != null) {
            return _TabProhibited!!
        }
        _TabProhibited = ImageVector.Builder(
            name = "Filled.TabProhibited",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.857f, 3f)
                curveTo(4.201f, 3f, 2.857f, 4.343f, 2.857f, 6f)
                verticalLineTo(18f)
                curveTo(2.857f, 19.657f, 4.201f, 21f, 5.857f, 21f)
                horizontalLineTo(12.022f)
                curveTo(11.634f, 20.395f, 11.344f, 19.72f, 11.174f, 19f)
                horizontalLineTo(5.857f)
                curveTo(5.305f, 19f, 4.857f, 18.552f, 4.857f, 18f)
                verticalLineTo(6f)
                curveTo(4.857f, 5.448f, 5.305f, 5f, 5.857f, 5f)
                horizontalLineTo(17.857f)
                curveTo(18.41f, 5f, 18.857f, 5.448f, 18.857f, 6f)
                verticalLineTo(11.142f)
                curveTo(19.575f, 11.294f, 20.249f, 11.565f, 20.857f, 11.933f)
                verticalLineTo(6f)
                curveTo(20.857f, 4.343f, 19.514f, 3f, 17.857f, 3f)
                horizontalLineTo(5.857f)
                close()
                moveTo(17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                close()
                moveTo(14.191f, 19.748f)
                curveTo(13.755f, 19.108f, 13.5f, 18.333f, 13.5f, 17.5f)
                curveTo(13.5f, 15.291f, 15.291f, 13.5f, 17.5f, 13.5f)
                curveTo(18.333f, 13.5f, 19.108f, 13.755f, 19.748f, 14.191f)
                lineTo(14.191f, 19.748f)
                close()
                moveTo(15.252f, 20.809f)
                lineTo(20.809f, 15.252f)
                curveTo(21.245f, 15.892f, 21.5f, 16.667f, 21.5f, 17.5f)
                curveTo(21.5f, 19.709f, 19.709f, 21.5f, 17.5f, 21.5f)
                curveTo(16.667f, 21.5f, 15.892f, 21.245f, 15.252f, 20.809f)
                close()
            }
        }.build()

        return _TabProhibited!!
    }

@Suppress("ObjectPropertyName")
private var _TabProhibited: ImageVector? = null

@Preview
@Composable
private fun TabProhibitedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TabProhibited, contentDescription = null)
    }
}
