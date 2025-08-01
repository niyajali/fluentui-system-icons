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
package fluent.ui.system.icons.color

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Color.Comment: ImageVector
    get() {
        if (_Comment != null) {
            return _Comment!!
        }
        _Comment = ImageVector.Builder(
            name = "Colored.Comment",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFAB500),
                        0.535f to Color(0xFFFE8401),
                        1f to Color(0xFFFB5937)
                    ),
                    center = Offset(-2.615f, -2.847f),
                    radius = 35.931f
                )
            ) {
                moveTo(5.25f, 3f)
                curveTo(3.455f, 3f, 2f, 4.455f, 2f, 6.25f)
                verticalLineTo(14.75f)
                curveTo(2f, 16.545f, 3.455f, 18f, 5.25f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(20.75f)
                curveTo(6f, 21.78f, 7.176f, 22.368f, 8f, 21.75f)
                lineTo(13f, 18f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 18f, 22f, 16.545f, 22f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(22f, 4.455f, 20.545f, 3f, 18.75f, 3f)
                horizontalLineTo(5.25f)
                close()
            }
        }.build()

        return _Comment!!
    }

@Suppress("ObjectPropertyName")
private var _Comment: ImageVector? = null

@Preview
@Composable
private fun CommentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.Comment, contentDescription = null)
    }
}
