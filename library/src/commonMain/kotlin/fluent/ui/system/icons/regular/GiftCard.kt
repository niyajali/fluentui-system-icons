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

public val FluentIcons.Regular.GiftCard: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.GiftCard",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.25f, 4f)
            curveTo(3.455f, 4f, 2f, 5.455f, 2f, 7.25f)
            verticalLineTo(15.75f)
            curveTo(2f, 17.545f, 3.455f, 19f, 5.25f, 19f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 19f, 22f, 17.545f, 22f, 15.75f)
            verticalLineTo(7.25f)
            curveTo(22f, 5.455f, 20.545f, 4f, 18.75f, 4f)
            horizontalLineTo(5.25f)
            close()
            moveTo(3.5f, 7.25f)
            curveTo(3.5f, 6.284f, 4.284f, 5.5f, 5.25f, 5.5f)
            horizontalLineTo(8f)
            verticalLineTo(6.708f)
            curveTo(7.694f, 6.574f, 7.356f, 6.5f, 7f, 6.5f)
            curveTo(5.619f, 6.5f, 4.5f, 7.619f, 4.5f, 9f)
            curveTo(4.5f, 9.356f, 4.574f, 9.694f, 4.708f, 10f)
            horizontalLineTo(3.5f)
            verticalLineTo(7.25f)
            close()
            moveTo(9.5f, 9f)
            curveTo(9.5f, 8.448f, 9.948f, 8f, 10.5f, 8f)
            curveTo(11.052f, 8f, 11.5f, 8.448f, 11.5f, 9f)
            curveTo(11.5f, 9.552f, 11.052f, 10f, 10.5f, 10f)
            horizontalLineTo(9.5f)
            verticalLineTo(9f)
            close()
            moveTo(8f, 10f)
            horizontalLineTo(7f)
            curveTo(6.448f, 10f, 6f, 9.552f, 6f, 9f)
            curveTo(6f, 8.448f, 6.448f, 8f, 7f, 8f)
            curveTo(7.552f, 8f, 8f, 8.448f, 8f, 9f)
            curveTo(8f, 9f, 8f, 9f, 8f, 9f)
            verticalLineTo(10f)
            close()
            moveTo(8f, 12.561f)
            verticalLineTo(17.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 17.5f, 3.5f, 16.716f, 3.5f, 15.75f)
            verticalLineTo(11.5f)
            horizontalLineTo(6.939f)
            lineTo(5.22f, 13.22f)
            curveTo(4.927f, 13.513f, 4.927f, 13.987f, 5.22f, 14.28f)
            curveTo(5.513f, 14.573f, 5.987f, 14.573f, 6.28f, 14.28f)
            lineTo(8f, 12.561f)
            close()
            moveTo(9.5f, 17.5f)
            verticalLineTo(12.561f)
            lineTo(11.22f, 14.28f)
            curveTo(11.513f, 14.573f, 11.987f, 14.573f, 12.28f, 14.28f)
            curveTo(12.573f, 13.987f, 12.573f, 13.513f, 12.28f, 13.22f)
            lineTo(10.561f, 11.5f)
            horizontalLineTo(20.5f)
            verticalLineTo(15.75f)
            curveTo(20.5f, 16.716f, 19.716f, 17.5f, 18.75f, 17.5f)
            horizontalLineTo(9.5f)
            close()
            moveTo(9.5f, 6.708f)
            verticalLineTo(5.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 5.5f, 20.5f, 6.284f, 20.5f, 7.25f)
            verticalLineTo(10f)
            horizontalLineTo(12.792f)
            curveTo(12.926f, 9.694f, 13f, 9.356f, 13f, 9f)
            curveTo(13f, 7.619f, 11.881f, 6.5f, 10.5f, 6.5f)
            curveTo(10.144f, 6.5f, 9.806f, 6.574f, 9.5f, 6.708f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GiftCardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.GiftCard, contentDescription = null)
    }
}
