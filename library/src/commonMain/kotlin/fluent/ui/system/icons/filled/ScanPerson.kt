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

public val FluentUi.Filled.ScanPerson: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ScanPerson",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
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
            curveTo(8.854f, 20.709f, 8.577f, 20.5f, 8.25f, 20.5f)
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
            curveTo(15f, 21.162f, 15.015f, 21.078f, 15.043f, 21f)
            curveTo(15.146f, 20.709f, 15.424f, 20.5f, 15.75f, 20.5f)
            horizontalLineTo(18.75f)
            close()
            moveTo(8.25f, 19.5f)
            curveTo(9.132f, 19.5f, 9.861f, 20.152f, 9.982f, 21f)
            horizontalLineTo(14.018f)
            curveTo(14.139f, 20.152f, 14.868f, 19.5f, 15.75f, 19.5f)
            horizontalLineTo(18.75f)
            curveTo(18.79f, 19.5f, 18.83f, 19.497f, 18.868f, 19.491f)
            curveTo(18.953f, 19.217f, 19f, 18.926f, 19f, 18.615f)
            verticalLineTo(18.25f)
            curveTo(19f, 17.007f, 17.993f, 16f, 16.75f, 16f)
            horizontalLineTo(7.25f)
            curveTo(6.007f, 16f, 5f, 17.007f, 5f, 18.25f)
            verticalLineTo(18.615f)
            curveTo(5f, 18.926f, 5.043f, 19.217f, 5.121f, 19.489f)
            curveTo(5.163f, 19.496f, 5.206f, 19.5f, 5.25f, 19.5f)
            horizontalLineTo(8.25f)
            close()
            moveTo(12f, 14f)
            curveTo(14.347f, 14f, 16.25f, 12.097f, 16.25f, 9.75f)
            curveTo(16.25f, 7.403f, 14.347f, 5.5f, 12f, 5.5f)
            curveTo(9.653f, 5.5f, 7.75f, 7.403f, 7.75f, 9.75f)
            curveTo(7.75f, 12.097f, 9.653f, 14f, 12f, 14f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ScanPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ScanPerson, contentDescription = null)
    }
}
