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

public val FluentIcons.Regular.GiftCardAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.GiftCardAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 5f)
            curveTo(2f, 3.343f, 3.343f, 2f, 5f, 2f)
            horizontalLineTo(19f)
            curveTo(20.657f, 2f, 22f, 3.343f, 22f, 5f)
            verticalLineTo(12.81f)
            curveTo(21.556f, 12.383f, 21.051f, 12.019f, 20.5f, 11.732f)
            verticalLineTo(9.5f)
            horizontalLineTo(10.561f)
            lineTo(12.28f, 11.22f)
            curveTo(12.573f, 11.513f, 12.573f, 11.987f, 12.28f, 12.28f)
            curveTo(11.987f, 12.573f, 11.513f, 12.573f, 11.22f, 12.28f)
            lineTo(9.5f, 10.561f)
            verticalLineTo(15.5f)
            horizontalLineTo(11.314f)
            curveTo(11.159f, 15.978f, 11.059f, 16.48f, 11.019f, 17f)
            horizontalLineTo(5f)
            curveTo(3.343f, 17f, 2f, 15.657f, 2f, 14f)
            verticalLineTo(5f)
            close()
            moveTo(5f, 3.5f)
            curveTo(4.172f, 3.5f, 3.5f, 4.172f, 3.5f, 5f)
            verticalLineTo(8f)
            horizontalLineTo(4.708f)
            curveTo(4.574f, 7.694f, 4.5f, 7.356f, 4.5f, 7f)
            curveTo(4.5f, 5.619f, 5.619f, 4.5f, 7f, 4.5f)
            curveTo(7.356f, 4.5f, 7.694f, 4.574f, 8f, 4.708f)
            verticalLineTo(3.5f)
            horizontalLineTo(5f)
            close()
            moveTo(9.5f, 3.5f)
            verticalLineTo(4.708f)
            curveTo(9.806f, 4.574f, 10.144f, 4.5f, 10.5f, 4.5f)
            curveTo(11.881f, 4.5f, 13f, 5.619f, 13f, 7f)
            curveTo(13f, 7.356f, 12.926f, 7.694f, 12.792f, 8f)
            horizontalLineTo(20.5f)
            verticalLineTo(5f)
            curveTo(20.5f, 4.172f, 19.828f, 3.5f, 19f, 3.5f)
            horizontalLineTo(9.5f)
            close()
            moveTo(8f, 15.5f)
            verticalLineTo(10.561f)
            lineTo(6.28f, 12.28f)
            curveTo(5.987f, 12.573f, 5.513f, 12.573f, 5.22f, 12.28f)
            curveTo(4.927f, 11.987f, 4.927f, 11.513f, 5.22f, 11.22f)
            lineTo(6.939f, 9.5f)
            horizontalLineTo(3.5f)
            verticalLineTo(14f)
            curveTo(3.5f, 14.828f, 4.172f, 15.5f, 5f, 15.5f)
            horizontalLineTo(8f)
            close()
            moveTo(10.5f, 8f)
            curveTo(11.052f, 8f, 11.5f, 7.552f, 11.5f, 7f)
            curveTo(11.5f, 6.448f, 11.052f, 6f, 10.5f, 6f)
            curveTo(9.948f, 6f, 9.5f, 6.448f, 9.5f, 7f)
            verticalLineTo(8f)
            horizontalLineTo(10.5f)
            close()
            moveTo(8f, 6.996f)
            curveTo(7.998f, 6.445f, 7.551f, 6f, 7f, 6f)
            curveTo(6.448f, 6f, 6f, 6.448f, 6f, 7f)
            curveTo(6f, 7.552f, 6.448f, 8f, 7f, 8f)
            horizontalLineTo(8f)
            verticalLineTo(6.996f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            close()
            moveTo(18.001f, 18f)
            lineTo(18.001f, 20.503f)
            curveTo(18.001f, 20.78f, 17.777f, 21.003f, 17.501f, 21.003f)
            curveTo(17.225f, 21.003f, 17.001f, 20.78f, 17.001f, 20.503f)
            lineTo(17.001f, 18f)
            horizontalLineTo(14.496f)
            curveTo(14.22f, 18f, 13.996f, 17.776f, 13.996f, 17.5f)
            curveTo(13.996f, 17.224f, 14.22f, 17f, 14.496f, 17f)
            horizontalLineTo(17f)
            lineTo(17f, 14.499f)
            curveTo(17f, 14.223f, 17.224f, 13.999f, 17.5f, 13.999f)
            curveTo(17.776f, 13.999f, 18f, 14.223f, 18f, 14.499f)
            lineTo(18f, 17f)
            horizontalLineTo(20.497f)
            curveTo(20.772f, 17f, 20.996f, 17.224f, 20.996f, 17.5f)
            curveTo(20.996f, 17.776f, 20.772f, 18f, 20.497f, 18f)
            horizontalLineTo(18.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GiftCardAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.GiftCardAdd, contentDescription = null)
    }
}
