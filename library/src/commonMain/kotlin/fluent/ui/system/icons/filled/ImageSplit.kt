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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.ImageSplit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ImageSplit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.5f, 2.75f)
            curveTo(12.5f, 2.336f, 12.164f, 2f, 11.75f, 2f)
            curveTo(11.336f, 2f, 11f, 2.336f, 11f, 2.75f)
            verticalLineTo(21.25f)
            curveTo(11f, 21.664f, 11.336f, 22f, 11.75f, 22f)
            curveTo(12.164f, 22f, 12.5f, 21.664f, 12.5f, 21.25f)
            verticalLineTo(2.75f)
            close()
            moveTo(5.25f, 4.5f)
            curveTo(4.284f, 4.5f, 3.5f, 5.284f, 3.5f, 6.25f)
            verticalLineTo(6.75f)
            curveTo(3.5f, 7.164f, 3.164f, 7.5f, 2.75f, 7.5f)
            curveTo(2.336f, 7.5f, 2f, 7.164f, 2f, 6.75f)
            verticalLineTo(6.25f)
            curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
            horizontalLineTo(5.75f)
            curveTo(6.164f, 3f, 6.5f, 3.336f, 6.5f, 3.75f)
            curveTo(6.5f, 4.164f, 6.164f, 4.5f, 5.75f, 4.5f)
            horizontalLineTo(5.25f)
            close()
            moveTo(5.25f, 19.5f)
            curveTo(4.284f, 19.5f, 3.5f, 18.716f, 3.5f, 17.75f)
            verticalLineTo(17.25f)
            curveTo(3.5f, 16.836f, 3.164f, 16.5f, 2.75f, 16.5f)
            curveTo(2.336f, 16.5f, 2f, 16.836f, 2f, 17.25f)
            verticalLineTo(17.75f)
            curveTo(2f, 19.545f, 3.455f, 21f, 5.25f, 21f)
            horizontalLineTo(5.75f)
            curveTo(6.164f, 21f, 6.5f, 20.664f, 6.5f, 20.25f)
            curveTo(6.5f, 19.836f, 6.164f, 19.5f, 5.75f, 19.5f)
            horizontalLineTo(5.25f)
            close()
            moveTo(7.5f, 3.75f)
            curveTo(7.5f, 3.336f, 7.836f, 3f, 8.25f, 3f)
            horizontalLineTo(9.25f)
            curveTo(9.664f, 3f, 10f, 3.336f, 10f, 3.75f)
            curveTo(10f, 4.164f, 9.664f, 4.5f, 9.25f, 4.5f)
            horizontalLineTo(8.25f)
            curveTo(7.836f, 4.5f, 7.5f, 4.164f, 7.5f, 3.75f)
            close()
            moveTo(8.25f, 19.5f)
            curveTo(7.836f, 19.5f, 7.5f, 19.836f, 7.5f, 20.25f)
            curveTo(7.5f, 20.664f, 7.836f, 21f, 8.25f, 21f)
            horizontalLineTo(9.25f)
            curveTo(9.664f, 21f, 10f, 20.664f, 10f, 20.25f)
            curveTo(10f, 19.836f, 9.664f, 19.5f, 9.25f, 19.5f)
            horizontalLineTo(8.25f)
            close()
            moveTo(2.75f, 8.5f)
            curveTo(3.164f, 8.5f, 3.5f, 8.836f, 3.5f, 9.25f)
            verticalLineTo(14.75f)
            curveTo(3.5f, 15.164f, 3.164f, 15.5f, 2.75f, 15.5f)
            curveTo(2.336f, 15.5f, 2f, 15.164f, 2f, 14.75f)
            verticalLineTo(9.25f)
            curveTo(2f, 8.836f, 2.336f, 8.5f, 2.75f, 8.5f)
            close()
            moveTo(13.5f, 21f)
            horizontalLineTo(18.75f)
            curveTo(19.375f, 21f, 19.958f, 20.824f, 20.453f, 20.519f)
            lineTo(13.525f, 13.718f)
            lineTo(13.5f, 13.697f)
            verticalLineTo(21f)
            close()
            moveTo(13.5f, 12.059f)
            curveTo(13.84f, 12.136f, 14.166f, 12.293f, 14.448f, 12.531f)
            lineTo(14.576f, 12.648f)
            lineTo(21.515f, 19.459f)
            curveTo(21.822f, 18.963f, 22f, 18.377f, 22f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(22f, 4.455f, 20.545f, 3f, 18.75f, 3f)
            horizontalLineTo(13.5f)
            verticalLineTo(12.059f)
            close()
            moveTo(19.75f, 8.75f)
            curveTo(19.75f, 9.855f, 18.855f, 10.75f, 17.75f, 10.75f)
            curveTo(16.645f, 10.75f, 15.75f, 9.855f, 15.75f, 8.75f)
            curveTo(15.75f, 7.645f, 16.645f, 6.75f, 17.75f, 6.75f)
            curveTo(18.855f, 6.75f, 19.75f, 7.645f, 19.75f, 8.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ImageSplitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ImageSplit, contentDescription = null)
    }
}
