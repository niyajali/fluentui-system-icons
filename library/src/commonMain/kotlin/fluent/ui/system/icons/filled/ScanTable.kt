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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.ScanTable: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ScanTable",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.5f, 5.25f)
            curveTo(3.5f, 4.284f, 4.284f, 3.5f, 5.25f, 3.5f)
            horizontalLineTo(8.25f)
            curveTo(8.664f, 3.5f, 9f, 3.164f, 9f, 2.75f)
            curveTo(9f, 2.336f, 8.664f, 2f, 8.25f, 2f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 2f, 2f, 3.455f, 2f, 5.25f)
            verticalLineTo(8.25f)
            curveTo(2f, 8.664f, 2.336f, 9f, 2.75f, 9f)
            curveTo(3.164f, 9f, 3.5f, 8.664f, 3.5f, 8.25f)
            verticalLineTo(5.25f)
            close()
            moveTo(3.5f, 18.75f)
            curveTo(3.5f, 19.716f, 4.284f, 20.5f, 5.25f, 20.5f)
            horizontalLineTo(8.25f)
            curveTo(8.664f, 20.5f, 9f, 20.836f, 9f, 21.25f)
            curveTo(9f, 21.664f, 8.664f, 22f, 8.25f, 22f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 22f, 2f, 20.545f, 2f, 18.75f)
            verticalLineTo(15.75f)
            curveTo(2f, 15.336f, 2.336f, 15f, 2.75f, 15f)
            curveTo(3.164f, 15f, 3.5f, 15.336f, 3.5f, 15.75f)
            verticalLineTo(18.75f)
            close()
            moveTo(18.75f, 3.5f)
            curveTo(19.716f, 3.5f, 20.5f, 4.284f, 20.5f, 5.25f)
            verticalLineTo(8.25f)
            curveTo(20.5f, 8.664f, 20.836f, 9f, 21.25f, 9f)
            curveTo(21.664f, 9f, 22f, 8.664f, 22f, 8.25f)
            verticalLineTo(5.25f)
            curveTo(22f, 3.455f, 20.545f, 2f, 18.75f, 2f)
            horizontalLineTo(15.75f)
            curveTo(15.336f, 2f, 15f, 2.336f, 15f, 2.75f)
            curveTo(15f, 3.164f, 15.336f, 3.5f, 15.75f, 3.5f)
            horizontalLineTo(18.75f)
            close()
            moveTo(20.5f, 18.75f)
            curveTo(20.5f, 19.716f, 19.716f, 20.5f, 18.75f, 20.5f)
            horizontalLineTo(15.75f)
            curveTo(15.336f, 20.5f, 15f, 20.836f, 15f, 21.25f)
            curveTo(15f, 21.664f, 15.336f, 22f, 15.75f, 22f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 22f, 22f, 20.545f, 22f, 18.75f)
            verticalLineTo(15.75f)
            curveTo(22f, 15.336f, 21.664f, 15f, 21.25f, 15f)
            curveTo(20.836f, 15f, 20.5f, 15.336f, 20.5f, 15.75f)
            verticalLineTo(18.75f)
            close()
            moveTo(17.999f, 11f)
            verticalLineTo(15f)
            curveTo(17.999f, 16.598f, 16.75f, 17.904f, 15.175f, 17.995f)
            lineTo(14.999f, 18f)
            horizontalLineTo(8.999f)
            curveTo(7.401f, 18f, 6.095f, 16.751f, 6.004f, 15.176f)
            lineTo(5.999f, 15f)
            verticalLineTo(11f)
            horizontalLineTo(17.999f)
            close()
            moveTo(14.999f, 6f)
            curveTo(16.597f, 6f, 17.903f, 7.249f, 17.994f, 8.824f)
            lineTo(17.999f, 9f)
            verticalLineTo(9.5f)
            horizontalLineTo(5.999f)
            verticalLineTo(9f)
            curveTo(5.999f, 7.402f, 7.248f, 6.096f, 8.823f, 6.005f)
            lineTo(8.999f, 6f)
            horizontalLineTo(14.999f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ScanTablePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ScanTable, contentDescription = null)
    }
}
