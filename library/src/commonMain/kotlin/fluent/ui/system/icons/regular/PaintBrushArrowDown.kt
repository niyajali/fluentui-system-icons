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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.PaintBrushArrowDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PaintBrushArrowDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            curveTo(10.619f, 2f, 9.5f, 3.119f, 9.5f, 4.5f)
            verticalLineTo(7.5f)
            horizontalLineTo(7.112f)
            curveTo(5.938f, 7.5f, 5.035f, 8.493f, 5.072f, 9.631f)
            curveTo(5.115f, 10.923f, 5.117f, 12.987f, 4.855f, 15.114f)
            curveTo(4.59f, 17.262f, 4.068f, 19.378f, 3.12f, 20.843f)
            curveTo(2.971f, 21.073f, 2.96f, 21.367f, 3.091f, 21.608f)
            curveTo(3.222f, 21.85f, 3.475f, 22f, 3.75f, 22f)
            horizontalLineTo(15.525f)
            lineTo(14.513f, 20.987f)
            curveTo(14.367f, 20.842f, 14.252f, 20.676f, 14.168f, 20.5f)
            horizontalLineTo(11.129f)
            lineTo(11.482f, 18.913f)
            curveTo(11.572f, 18.508f, 11.317f, 18.108f, 10.913f, 18.018f)
            curveTo(10.508f, 17.928f, 10.108f, 18.183f, 10.018f, 18.587f)
            lineTo(9.593f, 20.5f)
            horizontalLineTo(8.281f)
            curveTo(8.307f, 20.433f, 8.333f, 20.364f, 8.36f, 20.291f)
            curveTo(8.59f, 19.667f, 8.857f, 18.8f, 8.992f, 17.856f)
            curveTo(9.051f, 17.446f, 8.766f, 17.066f, 8.356f, 17.007f)
            curveTo(7.946f, 16.949f, 7.566f, 17.234f, 7.507f, 17.644f)
            curveTo(7.392f, 18.45f, 7.16f, 19.208f, 6.952f, 19.772f)
            curveTo(6.849f, 20.052f, 6.754f, 20.279f, 6.685f, 20.435f)
            lineTo(6.656f, 20.5f)
            horizontalLineTo(5.01f)
            curveTo(5.732f, 18.926f, 6.127f, 17.055f, 6.344f, 15.298f)
            curveTo(6.44f, 14.51f, 6.503f, 13.734f, 6.541f, 13f)
            horizontalLineTo(17.5f)
            verticalLineTo(14.193f)
            curveTo(17.74f, 14.07f, 18.012f, 14f, 18.3f, 14f)
            curveTo(18.549f, 14f, 18.786f, 14.052f, 19f, 14.146f)
            verticalLineTo(9.75f)
            curveTo(19f, 8.507f, 17.993f, 7.5f, 16.75f, 7.5f)
            horizontalLineTo(14.5f)
            verticalLineTo(4.5f)
            curveTo(14.5f, 3.119f, 13.381f, 2f, 12f, 2f)
            close()
            moveTo(17.5f, 11.5f)
            horizontalLineTo(6.59f)
            curveTo(6.6f, 10.764f, 6.589f, 10.109f, 6.571f, 9.582f)
            curveTo(6.561f, 9.256f, 6.82f, 9f, 7.112f, 9f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 9f, 11f, 8.664f, 11f, 8.25f)
            verticalLineTo(4.5f)
            curveTo(11f, 3.948f, 11.448f, 3.5f, 12f, 3.5f)
            curveTo(12.552f, 3.5f, 13f, 3.948f, 13f, 4.5f)
            verticalLineTo(8.25f)
            curveTo(13f, 8.664f, 13.336f, 9f, 13.75f, 9f)
            horizontalLineTo(16.75f)
            curveTo(17.164f, 9f, 17.5f, 9.336f, 17.5f, 9.75f)
            verticalLineTo(11.5f)
            close()
            moveTo(15.22f, 19.22f)
            curveTo(15.513f, 18.927f, 15.987f, 18.927f, 16.28f, 19.22f)
            lineTo(17.55f, 20.489f)
            verticalLineTo(15.75f)
            curveTo(17.55f, 15.336f, 17.886f, 15f, 18.3f, 15f)
            curveTo(18.714f, 15f, 19.05f, 15.336f, 19.05f, 15.75f)
            verticalLineTo(20.389f)
            lineTo(20.22f, 19.22f)
            curveTo(20.513f, 18.927f, 20.987f, 18.927f, 21.28f, 19.22f)
            curveTo(21.573f, 19.513f, 21.573f, 19.987f, 21.28f, 20.28f)
            lineTo(18.78f, 22.78f)
            curveTo(18.64f, 22.921f, 18.449f, 23f, 18.25f, 23f)
            curveTo(18.051f, 23f, 17.86f, 22.921f, 17.72f, 22.78f)
            lineTo(15.22f, 20.28f)
            curveTo(14.927f, 19.987f, 14.927f, 19.513f, 15.22f, 19.22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PaintBrushArrowDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PaintBrushArrowDown, contentDescription = null)
    }
}
