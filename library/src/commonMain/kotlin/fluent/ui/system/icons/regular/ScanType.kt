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

public val FluentIcons.Regular.ScanType: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ScanType",
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
            moveTo(18.75f, 20.5f)
            curveTo(19.716f, 20.5f, 20.5f, 19.716f, 20.5f, 18.75f)
            verticalLineTo(15.75f)
            curveTo(20.5f, 15.336f, 20.836f, 15f, 21.25f, 15f)
            curveTo(21.664f, 15f, 22f, 15.336f, 22f, 15.75f)
            verticalLineTo(18.75f)
            curveTo(22f, 20.545f, 20.545f, 22f, 18.75f, 22f)
            horizontalLineTo(15.75f)
            curveTo(15.336f, 22f, 15f, 21.664f, 15f, 21.25f)
            curveTo(15f, 20.836f, 15.336f, 20.5f, 15.75f, 20.5f)
            horizontalLineTo(18.75f)
            close()
            moveTo(7f, 7.75f)
            curveTo(7f, 7.336f, 7.336f, 7f, 7.75f, 7f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 7f, 17f, 7.336f, 17f, 7.75f)
            verticalLineTo(9f)
            curveTo(17f, 9.414f, 16.664f, 9.75f, 16.25f, 9.75f)
            curveTo(15.836f, 9.75f, 15.5f, 9.414f, 15.5f, 9f)
            verticalLineTo(8.5f)
            horizontalLineTo(12.75f)
            verticalLineTo(15.5f)
            horizontalLineTo(14.25f)
            curveTo(14.664f, 15.5f, 15f, 15.836f, 15f, 16.25f)
            curveTo(15f, 16.664f, 14.664f, 17f, 14.25f, 17f)
            horizontalLineTo(9.75f)
            curveTo(9.336f, 17f, 9f, 16.664f, 9f, 16.25f)
            curveTo(9f, 15.836f, 9.336f, 15.5f, 9.75f, 15.5f)
            horizontalLineTo(11.25f)
            verticalLineTo(8.5f)
            horizontalLineTo(8.5f)
            verticalLineTo(9f)
            curveTo(8.5f, 9.414f, 8.164f, 9.75f, 7.75f, 9.75f)
            curveTo(7.336f, 9.75f, 7f, 9.414f, 7f, 9f)
            verticalLineTo(7.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ScanTypePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ScanType, contentDescription = null)
    }
}
