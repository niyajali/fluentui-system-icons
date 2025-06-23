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

public val FluentIcons.Filled.RatingMature: ImageVector
    get() {
        if (_RatingMature != null) {
            return _RatingMature!!
        }
        _RatingMature = ImageVector.Builder(
            name = "Filled.RatingMature",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(8.826f, 8.27f)
                curveTo(8.624f, 8.027f, 8.292f, 7.937f, 7.995f, 8.045f)
                curveTo(7.698f, 8.152f, 7.5f, 8.434f, 7.5f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(7.5f, 15.664f, 7.836f, 16f, 8.25f, 16f)
                curveTo(8.664f, 16f, 9f, 15.664f, 9f, 15.25f)
                verticalLineTo(10.822f)
                lineTo(11.424f, 13.73f)
                curveTo(11.566f, 13.901f, 11.777f, 14f, 12f, 14f)
                curveTo(12.223f, 14f, 12.434f, 13.901f, 12.576f, 13.73f)
                lineTo(15f, 10.822f)
                verticalLineTo(15.25f)
                curveTo(15f, 15.664f, 15.336f, 16f, 15.75f, 16f)
                curveTo(16.164f, 16f, 16.5f, 15.664f, 16.5f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(16.5f, 8.434f, 16.302f, 8.152f, 16.005f, 8.045f)
                curveTo(15.708f, 7.937f, 15.376f, 8.027f, 15.174f, 8.27f)
                lineTo(12f, 12.078f)
                lineTo(8.826f, 8.27f)
                close()
            }
        }.build()

        return _RatingMature!!
    }

@Suppress("ObjectPropertyName")
private var _RatingMature: ImageVector? = null

@Preview
@Composable
private fun RatingMaturePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.RatingMature, contentDescription = null)
    }
}
