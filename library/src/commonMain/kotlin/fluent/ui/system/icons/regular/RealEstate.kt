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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.RealEstate: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.RealEstate",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.5f, 4.25f)
            verticalLineTo(20.5f)
            horizontalLineTo(5f)
            verticalLineTo(6.5f)
            horizontalLineTo(19.728f)
            curveTo(20.154f, 6.5f, 20.5f, 6.154f, 20.5f, 5.728f)
            curveTo(20.5f, 5.301f, 20.154f, 4.955f, 19.728f, 4.955f)
            lineTo(5f, 4.955f)
            verticalLineTo(4.205f)
            curveTo(5f, 3.816f, 4.684f, 3.5f, 4.295f, 3.5f)
            horizontalLineTo(4.25f)
            curveTo(3.836f, 3.5f, 3.5f, 3.836f, 3.5f, 4.25f)
            close()
            moveTo(22f, 5.728f)
            curveTo(22f, 6.511f, 21.603f, 7.202f, 21f, 7.611f)
            verticalLineTo(15.25f)
            curveTo(21f, 17.321f, 19.321f, 19f, 17.25f, 19f)
            horizontalLineTo(8.75f)
            curveTo(7.906f, 19f, 7.127f, 18.721f, 6.5f, 18.25f)
            verticalLineTo(20.75f)
            curveTo(6.5f, 21.44f, 5.94f, 22f, 5.25f, 22f)
            horizontalLineTo(3.25f)
            curveTo(2.56f, 22f, 2f, 21.44f, 2f, 20.75f)
            verticalLineTo(4.25f)
            curveTo(2f, 3.007f, 3.007f, 2f, 4.25f, 2f)
            horizontalLineTo(4.295f)
            curveTo(5.249f, 2f, 6.062f, 2.606f, 6.369f, 3.455f)
            horizontalLineTo(19.728f)
            curveTo(20.983f, 3.455f, 22f, 4.472f, 22f, 5.728f)
            close()
            moveTo(6.5f, 8f)
            verticalLineTo(15.25f)
            curveTo(6.5f, 16.493f, 7.507f, 17.5f, 8.75f, 17.5f)
            horizontalLineTo(17.25f)
            curveTo(18.493f, 17.5f, 19.5f, 16.493f, 19.5f, 15.25f)
            verticalLineTo(8f)
            horizontalLineTo(6.5f)
            close()
            moveTo(9.5f, 12.46f)
            curveTo(9.5f, 12.168f, 9.628f, 11.891f, 9.849f, 11.701f)
            lineTo(12.675f, 9.279f)
            curveTo(12.862f, 9.119f, 13.138f, 9.119f, 13.325f, 9.279f)
            lineTo(16.151f, 11.701f)
            curveTo(16.372f, 11.891f, 16.5f, 12.168f, 16.5f, 12.46f)
            verticalLineTo(15.5f)
            curveTo(16.5f, 15.776f, 16.276f, 16f, 16f, 16f)
            horizontalLineTo(14.25f)
            curveTo(14.112f, 16f, 14f, 15.888f, 14f, 15.75f)
            verticalLineTo(14.5f)
            curveTo(14f, 14.224f, 13.776f, 14f, 13.5f, 14f)
            horizontalLineTo(12.5f)
            curveTo(12.224f, 14f, 12f, 14.224f, 12f, 14.5f)
            verticalLineTo(15.75f)
            curveTo(12f, 15.888f, 11.888f, 16f, 11.75f, 16f)
            horizontalLineTo(10f)
            curveTo(9.724f, 16f, 9.5f, 15.776f, 9.5f, 15.5f)
            verticalLineTo(12.46f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RealEstatePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.RealEstate, contentDescription = null)
    }
}
