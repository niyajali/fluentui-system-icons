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

public val FluentUi.Regular.DeskMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DeskMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.629f, 5f)
            curveTo(4.938f, 4.126f, 5.771f, 3.5f, 6.751f, 3.5f)
            horizontalLineTo(17.251f)
            curveTo(19.874f, 3.5f, 22.001f, 5.627f, 22.001f, 8.25f)
            verticalLineTo(16.75f)
            curveTo(22.001f, 17.164f, 21.665f, 17.5f, 21.251f, 17.5f)
            curveTo(20.849f, 17.5f, 20.521f, 17.184f, 20.502f, 16.787f)
            verticalLineTo(8.25f)
            curveTo(20.502f, 6.455f, 19.047f, 5f, 17.252f, 5f)
            horizontalLineTo(4.629f)
            close()
            moveTo(2f, 8.25f)
            curveTo(2f, 7.007f, 3.007f, 6f, 4.25f, 6f)
            horizontalLineTo(17.25f)
            curveTo(18.493f, 6f, 19.5f, 7.007f, 19.5f, 8.25f)
            verticalLineTo(19.25f)
            curveTo(19.5f, 19.664f, 19.164f, 20f, 18.75f, 20f)
            curveTo(18.336f, 20f, 18f, 19.664f, 18f, 19.25f)
            verticalLineTo(11.5f)
            horizontalLineTo(11f)
            verticalLineTo(17.75f)
            curveTo(11f, 18.993f, 9.993f, 20f, 8.75f, 20f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 20f, 2f, 18.993f, 2f, 17.75f)
            verticalLineTo(8.25f)
            close()
            moveTo(9.5f, 11.5f)
            horizontalLineTo(3.5f)
            verticalLineTo(17.75f)
            curveTo(3.5f, 18.164f, 3.836f, 18.5f, 4.25f, 18.5f)
            horizontalLineTo(8.75f)
            curveTo(9.164f, 18.5f, 9.5f, 18.164f, 9.5f, 17.75f)
            verticalLineTo(11.5f)
            close()
            moveTo(3.5f, 10f)
            horizontalLineTo(18f)
            verticalLineTo(8.25f)
            curveTo(18f, 7.836f, 17.664f, 7.5f, 17.25f, 7.5f)
            horizontalLineTo(4.25f)
            curveTo(3.836f, 7.5f, 3.5f, 7.836f, 3.5f, 8.25f)
            verticalLineTo(10f)
            close()
            moveTo(5.75f, 13f)
            curveTo(5.336f, 13f, 5f, 13.336f, 5f, 13.75f)
            curveTo(5f, 14.164f, 5.336f, 14.5f, 5.75f, 14.5f)
            horizontalLineTo(7.25f)
            curveTo(7.664f, 14.5f, 8f, 14.164f, 8f, 13.75f)
            curveTo(8f, 13.336f, 7.664f, 13f, 7.25f, 13f)
            horizontalLineTo(5.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DeskMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DeskMultiple, contentDescription = null)
    }
}
