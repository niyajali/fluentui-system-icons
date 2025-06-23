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

public val FluentIcons.Regular.PageFit: ImageVector
    get() {
        if (_PageFit != null) {
            return _PageFit!!
        }
        _PageFit = ImageVector.Builder(
            name = "Regular.PageFit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18.25f, 4f)
                curveTo(20.321f, 4f, 22f, 5.679f, 22f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(22f, 18.321f, 20.321f, 20f, 18.25f, 20f)
                horizontalLineTo(5.75f)
                curveTo(3.679f, 20f, 2f, 18.321f, 2f, 16.25f)
                verticalLineTo(7.75f)
                curveTo(2f, 5.679f, 3.679f, 4f, 5.75f, 4f)
                horizontalLineTo(18.25f)
                close()
                moveTo(18.25f, 5.5f)
                horizontalLineTo(5.75f)
                curveTo(4.507f, 5.5f, 3.5f, 6.507f, 3.5f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(3.5f, 17.493f, 4.507f, 18.5f, 5.75f, 18.5f)
                horizontalLineTo(18.25f)
                curveTo(19.493f, 18.5f, 20.5f, 17.493f, 20.5f, 16.25f)
                verticalLineTo(7.75f)
                curveTo(20.5f, 6.507f, 19.493f, 5.5f, 18.25f, 5.5f)
                close()
                moveTo(18.25f, 13f)
                curveTo(18.664f, 13f, 19f, 13.336f, 19f, 13.75f)
                verticalLineTo(15f)
                curveTo(19f, 16.105f, 18.105f, 17f, 17f, 17f)
                horizontalLineTo(15.75f)
                curveTo(15.336f, 17f, 15f, 16.664f, 15f, 16.25f)
                curveTo(15f, 15.836f, 15.336f, 15.5f, 15.75f, 15.5f)
                horizontalLineTo(17f)
                curveTo(17.276f, 15.5f, 17.5f, 15.276f, 17.5f, 15f)
                verticalLineTo(13.75f)
                curveTo(17.5f, 13.336f, 17.836f, 13f, 18.25f, 13f)
                close()
                moveTo(5.75f, 13f)
                curveTo(6.164f, 13f, 6.5f, 13.336f, 6.5f, 13.75f)
                verticalLineTo(15f)
                curveTo(6.5f, 15.276f, 6.724f, 15.5f, 7f, 15.5f)
                horizontalLineTo(8.25f)
                curveTo(8.664f, 15.5f, 9f, 15.836f, 9f, 16.25f)
                curveTo(9f, 16.664f, 8.664f, 17f, 8.25f, 17f)
                horizontalLineTo(7f)
                curveTo(5.895f, 17f, 5f, 16.105f, 5f, 15f)
                verticalLineTo(13.75f)
                curveTo(5f, 13.336f, 5.336f, 13f, 5.75f, 13f)
                close()
                moveTo(7f, 7f)
                horizontalLineTo(8.25f)
                curveTo(8.664f, 7f, 9f, 7.336f, 9f, 7.75f)
                curveTo(9f, 8.13f, 8.718f, 8.443f, 8.352f, 8.493f)
                lineTo(8.25f, 8.5f)
                horizontalLineTo(7f)
                curveTo(6.755f, 8.5f, 6.55f, 8.677f, 6.508f, 8.91f)
                lineTo(6.5f, 9f)
                verticalLineTo(10.25f)
                curveTo(6.5f, 10.664f, 6.164f, 11f, 5.75f, 11f)
                curveTo(5.37f, 11f, 5.057f, 10.718f, 5.007f, 10.352f)
                lineTo(5f, 10.25f)
                verticalLineTo(9f)
                curveTo(5f, 7.946f, 5.816f, 7.082f, 6.851f, 7.005f)
                lineTo(7f, 7f)
                close()
                moveTo(17f, 7f)
                curveTo(18.105f, 7f, 19f, 7.895f, 19f, 9f)
                verticalLineTo(10.25f)
                curveTo(19f, 10.664f, 18.664f, 11f, 18.25f, 11f)
                curveTo(17.836f, 11f, 17.5f, 10.664f, 17.5f, 10.25f)
                verticalLineTo(9f)
                curveTo(17.5f, 8.724f, 17.276f, 8.5f, 17f, 8.5f)
                horizontalLineTo(15.75f)
                curveTo(15.336f, 8.5f, 15f, 8.164f, 15f, 7.75f)
                curveTo(15f, 7.336f, 15.336f, 7f, 15.75f, 7f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _PageFit!!
    }

@Suppress("ObjectPropertyName")
private var _PageFit: ImageVector? = null

@Preview
@Composable
private fun PageFitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PageFit, contentDescription = null)
    }
}
