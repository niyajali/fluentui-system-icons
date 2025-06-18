/**
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

import org.jetbrains.compose.ui.tooling.preview.Preview
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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.PageFit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PageFit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
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
            moveTo(18.25f, 13f)
            curveTo(17.87f, 13f, 17.556f, 13.282f, 17.507f, 13.648f)
            lineTo(17.5f, 13.75f)
            verticalLineTo(15f)
            curveTo(17.5f, 15.245f, 17.323f, 15.45f, 17.09f, 15.492f)
            lineTo(17f, 15.5f)
            horizontalLineTo(15.75f)
            curveTo(15.336f, 15.5f, 15f, 15.836f, 15f, 16.25f)
            curveTo(15f, 16.63f, 15.282f, 16.944f, 15.648f, 16.993f)
            lineTo(15.75f, 17f)
            horizontalLineTo(17f)
            curveTo(18.054f, 17f, 18.918f, 16.184f, 18.994f, 15.149f)
            lineTo(19f, 15f)
            verticalLineTo(13.75f)
            curveTo(19f, 13.336f, 18.664f, 13f, 18.25f, 13f)
            close()
            moveTo(5.75f, 13f)
            curveTo(5.37f, 13f, 5.057f, 13.282f, 5.007f, 13.648f)
            lineTo(5f, 13.75f)
            verticalLineTo(15f)
            curveTo(5f, 16.054f, 5.816f, 16.918f, 6.851f, 16.994f)
            lineTo(7f, 17f)
            horizontalLineTo(8.25f)
            curveTo(8.664f, 17f, 9f, 16.664f, 9f, 16.25f)
            curveTo(9f, 15.87f, 8.718f, 15.557f, 8.352f, 15.507f)
            lineTo(8.25f, 15.5f)
            horizontalLineTo(7f)
            curveTo(6.755f, 15.5f, 6.55f, 15.323f, 6.508f, 15.09f)
            lineTo(6.5f, 15f)
            verticalLineTo(13.75f)
            curveTo(6.5f, 13.336f, 6.164f, 13f, 5.75f, 13f)
            close()
            moveTo(8.25f, 7f)
            horizontalLineTo(7f)
            lineTo(6.851f, 7.005f)
            curveTo(5.868f, 7.078f, 5.082f, 7.861f, 5.006f, 8.843f)
            lineTo(5f, 9f)
            verticalLineTo(10.25f)
            lineTo(5.007f, 10.352f)
            curveTo(5.057f, 10.718f, 5.37f, 11f, 5.75f, 11f)
            curveTo(6.13f, 11f, 6.443f, 10.718f, 6.493f, 10.352f)
            lineTo(6.5f, 10.25f)
            verticalLineTo(9f)
            lineTo(6.508f, 8.91f)
            curveTo(6.545f, 8.706f, 6.706f, 8.545f, 6.91f, 8.508f)
            lineTo(7f, 8.5f)
            horizontalLineTo(8.25f)
            lineTo(8.352f, 8.493f)
            curveTo(8.718f, 8.443f, 9f, 8.13f, 9f, 7.75f)
            curveTo(9f, 7.37f, 8.718f, 7.057f, 8.352f, 7.007f)
            lineTo(8.25f, 7f)
            close()
            moveTo(17f, 7f)
            horizontalLineTo(15.75f)
            curveTo(15.336f, 7f, 15f, 7.336f, 15f, 7.75f)
            curveTo(15f, 8.13f, 15.282f, 8.443f, 15.648f, 8.493f)
            lineTo(15.75f, 8.5f)
            horizontalLineTo(17f)
            curveTo(17.245f, 8.5f, 17.45f, 8.677f, 17.492f, 8.91f)
            lineTo(17.5f, 9f)
            verticalLineTo(10.25f)
            curveTo(17.5f, 10.664f, 17.836f, 11f, 18.25f, 11f)
            curveTo(18.63f, 11f, 18.944f, 10.718f, 18.993f, 10.352f)
            lineTo(19f, 10.25f)
            verticalLineTo(9f)
            curveTo(19f, 7.946f, 18.184f, 7.082f, 17.149f, 7.005f)
            lineTo(17f, 7f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PageFitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PageFit, contentDescription = null)
    }
}
