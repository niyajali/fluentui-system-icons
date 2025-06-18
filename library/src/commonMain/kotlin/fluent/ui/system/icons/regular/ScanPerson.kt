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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.ScanPerson: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ScanPerson",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.25f, 3.5f)
            curveTo(4.284f, 3.5f, 3.5f, 4.284f, 3.5f, 5.25f)
            verticalLineTo(8.25f)
            curveTo(3.5f, 8.664f, 3.164f, 9f, 2.75f, 9f)
            curveTo(2.336f, 9f, 2f, 8.664f, 2f, 8.25f)
            verticalLineTo(5.25f)
            curveTo(2f, 3.455f, 3.455f, 2f, 5.25f, 2f)
            horizontalLineTo(8.25f)
            curveTo(8.664f, 2f, 9f, 2.336f, 9f, 2.75f)
            curveTo(9f, 3.164f, 8.664f, 3.5f, 8.25f, 3.5f)
            horizontalLineTo(5.25f)
            close()
            moveTo(5.25f, 20.5f)
            curveTo(4.284f, 20.5f, 3.5f, 19.716f, 3.5f, 18.75f)
            verticalLineTo(15.75f)
            curveTo(3.5f, 15.336f, 3.164f, 15f, 2.75f, 15f)
            curveTo(2.336f, 15f, 2f, 15.336f, 2f, 15.75f)
            verticalLineTo(18.75f)
            curveTo(2f, 20.545f, 3.455f, 22f, 5.25f, 22f)
            horizontalLineTo(8.25f)
            curveTo(8.664f, 22f, 9f, 21.664f, 9f, 21.25f)
            curveTo(9f, 21.162f, 8.985f, 21.078f, 8.957f, 21f)
            lineTo(8.952f, 20.985f)
            curveTo(8.845f, 20.702f, 8.571f, 20.5f, 8.25f, 20.5f)
            horizontalLineTo(5.25f)
            close()
            moveTo(20.5f, 5.25f)
            curveTo(20.5f, 4.284f, 19.716f, 3.5f, 18.75f, 3.5f)
            horizontalLineTo(15.75f)
            curveTo(15.336f, 3.5f, 15f, 3.164f, 15f, 2.75f)
            curveTo(15f, 2.336f, 15.336f, 2f, 15.75f, 2f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 2f, 22f, 3.455f, 22f, 5.25f)
            verticalLineTo(8.25f)
            curveTo(22f, 8.664f, 21.664f, 9f, 21.25f, 9f)
            curveTo(20.836f, 9f, 20.5f, 8.664f, 20.5f, 8.25f)
            verticalLineTo(5.25f)
            close()
            moveTo(18.75f, 20.5f)
            curveTo(19.716f, 20.5f, 20.5f, 19.716f, 20.5f, 18.75f)
            verticalLineTo(15.75f)
            curveTo(20.5f, 15.336f, 20.836f, 15f, 21.25f, 15f)
            curveTo(21.664f, 15f, 22f, 15.336f, 22f, 15.75f)
            verticalLineTo(18.75f)
            curveTo(22f, 20.545f, 20.545f, 22f, 18.75f, 22f)
            horizontalLineTo(15.75f)
            curveTo(15.336f, 22f, 15f, 21.664f, 15f, 21.25f)
            curveTo(15f, 21.139f, 15.024f, 21.033f, 15.068f, 20.938f)
            curveTo(15.186f, 20.68f, 15.447f, 20.5f, 15.75f, 20.5f)
            horizontalLineTo(18.75f)
            close()
            moveTo(6.5f, 18.615f)
            curveTo(6.5f, 18.925f, 6.586f, 19.221f, 6.758f, 19.5f)
            horizontalLineTo(5.25f)
            curveTo(5.206f, 19.5f, 5.163f, 19.496f, 5.121f, 19.489f)
            curveTo(5.043f, 19.217f, 5f, 18.926f, 5f, 18.615f)
            verticalLineTo(18.25f)
            curveTo(5f, 17.007f, 6.007f, 16f, 7.25f, 16f)
            horizontalLineTo(16.75f)
            curveTo(17.993f, 16f, 19f, 17.007f, 19f, 18.25f)
            verticalLineTo(18.615f)
            curveTo(19f, 18.926f, 18.953f, 19.217f, 18.868f, 19.491f)
            curveTo(18.83f, 19.497f, 18.79f, 19.5f, 18.75f, 19.5f)
            horizontalLineTo(17.207f)
            curveTo(17.403f, 19.212f, 17.5f, 18.914f, 17.5f, 18.615f)
            verticalLineTo(18.25f)
            curveTo(17.5f, 17.836f, 17.164f, 17.5f, 16.75f, 17.5f)
            horizontalLineTo(7.25f)
            curveTo(6.836f, 17.5f, 6.5f, 17.836f, 6.5f, 18.25f)
            verticalLineTo(18.615f)
            close()
            moveTo(14.75f, 9.75f)
            curveTo(14.75f, 8.231f, 13.519f, 7f, 12f, 7f)
            curveTo(10.481f, 7f, 9.25f, 8.231f, 9.25f, 9.75f)
            curveTo(9.25f, 11.269f, 10.481f, 12.5f, 12f, 12.5f)
            curveTo(13.519f, 12.5f, 14.75f, 11.269f, 14.75f, 9.75f)
            close()
            moveTo(16.25f, 9.75f)
            curveTo(16.25f, 12.097f, 14.347f, 14f, 12f, 14f)
            curveTo(9.653f, 14f, 7.75f, 12.097f, 7.75f, 9.75f)
            curveTo(7.75f, 7.403f, 9.653f, 5.5f, 12f, 5.5f)
            curveTo(14.347f, 5.5f, 16.25f, 7.403f, 16.25f, 9.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ScanPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ScanPerson, contentDescription = null)
    }
}
