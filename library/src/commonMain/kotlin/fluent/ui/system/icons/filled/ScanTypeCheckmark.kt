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

public val FluentUi.Filled.ScanTypeCheckmark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ScanTypeCheckmark",
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
            curveTo(9f, 20.836f, 8.664f, 20.5f, 8.25f, 20.5f)
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
            moveTo(6.75f, 8f)
            curveTo(6.75f, 7.448f, 7.198f, 7f, 7.75f, 7f)
            horizontalLineTo(16.25f)
            curveTo(16.802f, 7f, 17.25f, 7.448f, 17.25f, 8f)
            verticalLineTo(9.5f)
            curveTo(17.25f, 10.052f, 16.802f, 10.5f, 16.25f, 10.5f)
            curveTo(15.698f, 10.5f, 15.25f, 10.052f, 15.25f, 9.5f)
            verticalLineTo(9f)
            horizontalLineTo(13f)
            verticalLineTo(15f)
            horizontalLineTo(13.022f)
            curveTo(12.634f, 15.606f, 12.344f, 16.28f, 12.174f, 17f)
            horizontalLineTo(9.75f)
            curveTo(9.198f, 17f, 8.75f, 16.552f, 8.75f, 16f)
            curveTo(8.75f, 15.448f, 9.198f, 15f, 9.75f, 15f)
            horizontalLineTo(11f)
            verticalLineTo(9f)
            horizontalLineTo(8.75f)
            verticalLineTo(9.5f)
            curveTo(8.75f, 10.052f, 8.302f, 10.5f, 7.75f, 10.5f)
            curveTo(7.198f, 10.5f, 6.75f, 10.052f, 6.75f, 9.5f)
            verticalLineTo(8f)
            close()
            moveTo(24f, 18.5f)
            curveTo(24f, 21.538f, 21.538f, 24f, 18.5f, 24f)
            curveTo(15.462f, 24f, 13f, 21.538f, 13f, 18.5f)
            curveTo(13f, 15.462f, 15.462f, 13f, 18.5f, 13f)
            curveTo(21.538f, 13f, 24f, 15.462f, 24f, 18.5f)
            close()
            moveTo(21.854f, 16.146f)
            curveTo(21.658f, 15.951f, 21.342f, 15.951f, 21.146f, 16.146f)
            lineTo(17.5f, 19.793f)
            lineTo(15.854f, 18.146f)
            curveTo(15.658f, 17.951f, 15.342f, 17.951f, 15.146f, 18.146f)
            curveTo(14.951f, 18.342f, 14.951f, 18.658f, 15.146f, 18.854f)
            lineTo(17.146f, 20.854f)
            curveTo(17.342f, 21.049f, 17.658f, 21.049f, 17.854f, 20.854f)
            lineTo(21.854f, 16.854f)
            curveTo(22.049f, 16.658f, 22.049f, 16.342f, 21.854f, 16.146f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ScanTypeCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ScanTypeCheckmark, contentDescription = null)
    }
}
