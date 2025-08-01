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

public val FluentIcons.Filled.BorderInside: ImageVector
    get() {
        if (_BorderInside != null) {
            return _BorderInside!!
        }
        _BorderInside = ImageVector.Builder(
            name = "Filled.BorderInside",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13f, 5f)
                curveTo(13.552f, 5f, 14f, 4.552f, 14f, 4f)
                curveTo(14f, 3.448f, 13.552f, 3f, 13f, 3f)
                horizontalLineTo(11f)
                curveTo(10.448f, 3f, 10f, 3.448f, 10f, 4f)
                curveTo(10f, 4.552f, 10.448f, 5f, 11f, 5f)
                lineTo(13f, 5f)
                close()
                moveTo(4f, 10f)
                curveTo(4.552f, 10f, 5f, 10.448f, 5f, 11f)
                verticalLineTo(13f)
                curveTo(5f, 13.552f, 4.552f, 14f, 4f, 14f)
                curveTo(3.448f, 14f, 3f, 13.552f, 3f, 13f)
                verticalLineTo(11f)
                curveTo(3f, 10.448f, 3.448f, 10f, 4f, 10f)
                close()
                moveTo(20f, 10f)
                curveTo(19.448f, 10f, 19f, 10.448f, 19f, 11f)
                verticalLineTo(13f)
                curveTo(19f, 13.552f, 19.448f, 14f, 20f, 14f)
                curveTo(20.552f, 14f, 21f, 13.552f, 21f, 13f)
                verticalLineTo(11f)
                curveTo(21f, 10.448f, 20.552f, 10f, 20f, 10f)
                close()
                moveTo(14f, 20f)
                curveTo(14f, 20.552f, 13.552f, 21f, 13f, 21f)
                horizontalLineTo(11f)
                curveTo(10.448f, 21f, 10f, 20.552f, 10f, 20f)
                curveTo(10f, 19.448f, 10.448f, 19f, 11f, 19f)
                horizontalLineTo(13f)
                curveTo(13.552f, 19f, 14f, 19.448f, 14f, 20f)
                close()
                moveTo(6f, 3f)
                curveTo(6.552f, 3f, 7f, 3.448f, 7f, 4f)
                curveTo(7f, 4.552f, 6.552f, 5f, 6f, 5f)
                curveTo(5.448f, 5f, 5f, 5.448f, 5f, 6f)
                curveTo(5f, 6.552f, 4.552f, 7f, 4f, 7f)
                curveTo(3.448f, 7f, 3f, 6.552f, 3f, 6f)
                curveTo(3f, 4.343f, 4.343f, 3f, 6f, 3f)
                close()
                moveTo(17f, 4f)
                curveTo(17f, 3.448f, 17.448f, 3f, 18f, 3f)
                curveTo(19.657f, 3f, 21f, 4.343f, 21f, 6f)
                curveTo(21f, 6.552f, 20.552f, 7f, 20f, 7f)
                curveTo(19.448f, 7f, 19f, 6.552f, 19f, 6f)
                curveTo(19f, 5.448f, 18.552f, 5f, 18f, 5f)
                curveTo(17.448f, 5f, 17f, 4.552f, 17f, 4f)
                close()
                moveTo(6f, 21f)
                curveTo(6.552f, 21f, 7f, 20.552f, 7f, 20f)
                curveTo(7f, 19.448f, 6.552f, 19f, 6f, 19f)
                curveTo(5.448f, 19f, 5f, 18.552f, 5f, 18f)
                curveTo(5f, 17.448f, 4.552f, 17f, 4f, 17f)
                curveTo(3.448f, 17f, 3f, 17.448f, 3f, 18f)
                curveTo(3f, 19.657f, 4.343f, 21f, 6f, 21f)
                close()
                moveTo(17f, 20f)
                curveTo(17f, 20.552f, 17.448f, 21f, 18f, 21f)
                curveTo(19.657f, 21f, 21f, 19.657f, 21f, 18f)
                curveTo(21f, 17.448f, 20.552f, 17f, 20f, 17f)
                curveTo(19.448f, 17f, 19f, 17.448f, 19f, 18f)
                curveTo(19f, 18.552f, 18.552f, 19f, 18f, 19f)
                curveTo(17.448f, 19f, 17f, 19.448f, 17f, 20f)
                close()
                moveTo(13f, 7f)
                curveTo(13f, 6.448f, 12.552f, 6f, 12f, 6f)
                curveTo(11.448f, 6f, 11f, 6.448f, 11f, 7f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                curveTo(6.448f, 11f, 6f, 11.448f, 6f, 12f)
                curveTo(6f, 12.552f, 6.448f, 13f, 7f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                curveTo(11f, 17.552f, 11.448f, 18f, 12f, 18f)
                curveTo(12.552f, 18f, 13f, 17.552f, 13f, 17f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                curveTo(17.552f, 13f, 18f, 12.552f, 18f, 12f)
                curveTo(18f, 11.448f, 17.552f, 11f, 17f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _BorderInside!!
    }

@Suppress("ObjectPropertyName")
private var _BorderInside: ImageVector? = null

@Preview
@Composable
private fun BorderInsidePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BorderInside, contentDescription = null)
    }
}
