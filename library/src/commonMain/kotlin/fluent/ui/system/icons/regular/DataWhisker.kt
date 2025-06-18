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

public val FluentUi.Regular.DataWhisker: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DataWhisker",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.75f, 4f)
            curveTo(14.336f, 4f, 14f, 4.336f, 14f, 4.75f)
            curveTo(14f, 5.164f, 14.336f, 5.5f, 14.75f, 5.5f)
            horizontalLineTo(15.75f)
            verticalLineTo(7f)
            horizontalLineTo(15.25f)
            curveTo(14.007f, 7f, 13f, 8.007f, 13f, 9.25f)
            verticalLineTo(16.25f)
            curveTo(13f, 17.493f, 14.007f, 18.5f, 15.25f, 18.5f)
            horizontalLineTo(15.75f)
            verticalLineTo(20f)
            horizontalLineTo(14.75f)
            curveTo(14.336f, 20f, 14f, 20.336f, 14f, 20.75f)
            curveTo(14f, 21.164f, 14.336f, 21.5f, 14.75f, 21.5f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 21.5f, 19f, 21.164f, 19f, 20.75f)
            curveTo(19f, 20.336f, 18.664f, 20f, 18.25f, 20f)
            horizontalLineTo(17.25f)
            verticalLineTo(18.5f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 18.5f, 20f, 17.493f, 20f, 16.25f)
            verticalLineTo(9.25f)
            curveTo(20f, 8.007f, 18.993f, 7f, 17.75f, 7f)
            horizontalLineTo(17.25f)
            verticalLineTo(5.5f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 5.5f, 19f, 5.164f, 19f, 4.75f)
            curveTo(19f, 4.336f, 18.664f, 4f, 18.25f, 4f)
            horizontalLineTo(14.75f)
            close()
            moveTo(14.5f, 9.25f)
            curveTo(14.5f, 8.836f, 14.836f, 8.5f, 15.25f, 8.5f)
            horizontalLineTo(17.75f)
            curveTo(18.164f, 8.5f, 18.5f, 8.836f, 18.5f, 9.25f)
            verticalLineTo(11f)
            horizontalLineTo(14.5f)
            verticalLineTo(9.25f)
            close()
            moveTo(14.5f, 12.5f)
            horizontalLineTo(18.5f)
            verticalLineTo(16.25f)
            curveTo(18.5f, 16.664f, 18.164f, 17f, 17.75f, 17f)
            horizontalLineTo(15.25f)
            curveTo(14.836f, 17f, 14.5f, 16.664f, 14.5f, 16.25f)
            verticalLineTo(12.5f)
            close()
            moveTo(5.75f, 2f)
            curveTo(5.336f, 2f, 5f, 2.336f, 5f, 2.75f)
            curveTo(5f, 3.164f, 5.336f, 3.5f, 5.75f, 3.5f)
            horizontalLineTo(6.75f)
            verticalLineTo(5f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 5f, 4f, 6.007f, 4f, 7.25f)
            verticalLineTo(14.25f)
            curveTo(4f, 15.493f, 5.007f, 16.5f, 6.25f, 16.5f)
            horizontalLineTo(6.75f)
            verticalLineTo(18f)
            horizontalLineTo(5.75f)
            curveTo(5.336f, 18f, 5f, 18.336f, 5f, 18.75f)
            curveTo(5f, 19.164f, 5.336f, 19.5f, 5.75f, 19.5f)
            horizontalLineTo(9.25f)
            curveTo(9.664f, 19.5f, 10f, 19.164f, 10f, 18.75f)
            curveTo(10f, 18.336f, 9.664f, 18f, 9.25f, 18f)
            horizontalLineTo(8.25f)
            verticalLineTo(16.5f)
            horizontalLineTo(8.75f)
            curveTo(9.993f, 16.5f, 11f, 15.493f, 11f, 14.25f)
            verticalLineTo(7.25f)
            curveTo(11f, 6.007f, 9.993f, 5f, 8.75f, 5f)
            horizontalLineTo(8.25f)
            verticalLineTo(3.5f)
            horizontalLineTo(9.25f)
            curveTo(9.664f, 3.5f, 10f, 3.164f, 10f, 2.75f)
            curveTo(10f, 2.336f, 9.664f, 2f, 9.25f, 2f)
            horizontalLineTo(5.75f)
            close()
            moveTo(6.25f, 15f)
            curveTo(5.836f, 15f, 5.5f, 14.664f, 5.5f, 14.25f)
            verticalLineTo(12.5f)
            horizontalLineTo(9.5f)
            verticalLineTo(14.25f)
            curveTo(9.5f, 14.664f, 9.164f, 15f, 8.75f, 15f)
            horizontalLineTo(6.25f)
            close()
            moveTo(9.5f, 11f)
            horizontalLineTo(5.5f)
            verticalLineTo(7.25f)
            curveTo(5.5f, 6.836f, 5.836f, 6.5f, 6.25f, 6.5f)
            horizontalLineTo(8.75f)
            curveTo(9.164f, 6.5f, 9.5f, 6.836f, 9.5f, 7.25f)
            verticalLineTo(11f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DataWhiskerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DataWhisker, contentDescription = null)
    }
}
