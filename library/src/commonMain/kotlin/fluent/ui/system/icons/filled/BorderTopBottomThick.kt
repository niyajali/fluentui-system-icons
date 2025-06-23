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

public val FluentIcons.Filled.BorderTopBottomThick: ImageVector
    get() {
        if (_BorderTopBottomThick != null) {
            return _BorderTopBottomThick!!
        }
        _BorderTopBottomThick = ImageVector.Builder(
            name = "Filled.BorderTopBottomThick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 6f)
                curveTo(3f, 6.552f, 3.448f, 7f, 4f, 7f)
                curveTo(4.552f, 7f, 5f, 6.552f, 5f, 6f)
                curveTo(5f, 5.448f, 5.448f, 5f, 6f, 5f)
                horizontalLineTo(18f)
                curveTo(18.552f, 5f, 19f, 5.448f, 19f, 6f)
                curveTo(19f, 6.552f, 19.448f, 7f, 20f, 7f)
                curveTo(20.552f, 7f, 21f, 6.552f, 21f, 6f)
                curveTo(21f, 4.343f, 19.657f, 3f, 18f, 3f)
                horizontalLineTo(6f)
                curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
                close()
                moveTo(5f, 11f)
                curveTo(5f, 10.448f, 4.552f, 10f, 4f, 10f)
                curveTo(3.448f, 10f, 3f, 10.448f, 3f, 11f)
                verticalLineTo(13f)
                curveTo(3f, 13.552f, 3.448f, 14f, 4f, 14f)
                curveTo(4.552f, 14f, 5f, 13.552f, 5f, 13f)
                verticalLineTo(11f)
                close()
                moveTo(5.5f, 17.25f)
                verticalLineTo(17.75f)
                curveTo(5.5f, 18.164f, 5.836f, 18.5f, 6.25f, 18.5f)
                horizontalLineTo(17.75f)
                curveTo(18.164f, 18.5f, 18.5f, 18.164f, 18.5f, 17.75f)
                verticalLineTo(17.25f)
                curveTo(18.5f, 16.56f, 19.06f, 16f, 19.75f, 16f)
                curveTo(20.44f, 16f, 21f, 16.56f, 21f, 17.25f)
                verticalLineTo(18f)
                lineTo(20.99f, 18.001f)
                curveTo(20.863f, 19.678f, 19.461f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.539f, 21f, 3.137f, 19.678f, 3.01f, 18.001f)
                lineTo(3f, 18f)
                verticalLineTo(17.25f)
                curveTo(3f, 16.56f, 3.56f, 16f, 4.25f, 16f)
                curveTo(4.94f, 16f, 5.5f, 16.56f, 5.5f, 17.25f)
                close()
                moveTo(20f, 10f)
                curveTo(19.448f, 10f, 19f, 10.448f, 19f, 11f)
                verticalLineTo(13f)
                curveTo(19f, 13.552f, 19.448f, 14f, 20f, 14f)
                curveTo(20.552f, 14f, 21f, 13.552f, 21f, 13f)
                verticalLineTo(11f)
                curveTo(21f, 10.448f, 20.552f, 10f, 20f, 10f)
                close()
            }
        }.build()

        return _BorderTopBottomThick!!
    }

@Suppress("ObjectPropertyName")
private var _BorderTopBottomThick: ImageVector? = null

@Preview
@Composable
private fun BorderTopBottomThickPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BorderTopBottomThick, contentDescription = null)
    }
}
