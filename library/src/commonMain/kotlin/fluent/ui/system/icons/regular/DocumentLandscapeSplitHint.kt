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

public val FluentUi.Regular.DocumentLandscapeSplitHint: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentLandscapeSplitHint",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7f, 4.75f)
            curveTo(7f, 4.336f, 7.336f, 4f, 7.75f, 4f)
            horizontalLineTo(8.25f)
            curveTo(8.664f, 4f, 9f, 4.336f, 9f, 4.75f)
            curveTo(9f, 5.164f, 8.664f, 5.5f, 8.25f, 5.5f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 5.5f, 7f, 5.164f, 7f, 4.75f)
            close()
            moveTo(2.75f, 9.5f)
            curveTo(3.164f, 9.5f, 3.5f, 9.836f, 3.5f, 10.25f)
            verticalLineTo(13.75f)
            curveTo(3.5f, 14.164f, 3.164f, 14.5f, 2.75f, 14.5f)
            curveTo(2.336f, 14.5f, 2f, 14.164f, 2f, 13.75f)
            verticalLineTo(10.25f)
            curveTo(2f, 9.836f, 2.336f, 9.5f, 2.75f, 9.5f)
            close()
            moveTo(7.75f, 18.5f)
            curveTo(7.336f, 18.5f, 7f, 18.836f, 7f, 19.25f)
            curveTo(7f, 19.664f, 7.336f, 20f, 7.75f, 20f)
            horizontalLineTo(8.25f)
            curveTo(8.664f, 20f, 9f, 19.664f, 9f, 19.25f)
            curveTo(9f, 18.836f, 8.664f, 18.5f, 8.25f, 18.5f)
            horizontalLineTo(7.75f)
            close()
            moveTo(2f, 6f)
            curveTo(2f, 4.895f, 2.895f, 4f, 4f, 4f)
            horizontalLineTo(4.75f)
            curveTo(5.164f, 4f, 5.5f, 4.336f, 5.5f, 4.75f)
            curveTo(5.5f, 5.164f, 5.164f, 5.5f, 4.75f, 5.5f)
            horizontalLineTo(4f)
            curveTo(3.724f, 5.5f, 3.5f, 5.724f, 3.5f, 6f)
            verticalLineTo(7.25f)
            curveTo(3.5f, 7.664f, 3.164f, 8f, 2.75f, 8f)
            curveTo(2.336f, 8f, 2f, 7.664f, 2f, 7.25f)
            verticalLineTo(6f)
            close()
            moveTo(4f, 20f)
            curveTo(2.895f, 20f, 2f, 19.105f, 2f, 18f)
            verticalLineTo(16.75f)
            curveTo(2f, 16.336f, 2.336f, 16f, 2.75f, 16f)
            curveTo(3.164f, 16f, 3.5f, 16.336f, 3.5f, 16.75f)
            verticalLineTo(18f)
            curveTo(3.5f, 18.276f, 3.724f, 18.5f, 4f, 18.5f)
            horizontalLineTo(4.75f)
            curveTo(5.164f, 18.5f, 5.5f, 18.836f, 5.5f, 19.25f)
            curveTo(5.5f, 19.664f, 5.164f, 20f, 4.75f, 20f)
            horizontalLineTo(4f)
            close()
            moveTo(10.5f, 5.25f)
            curveTo(10.5f, 4.56f, 11.06f, 4f, 11.75f, 4f)
            horizontalLineTo(14.336f)
            curveTo(14.8f, 4f, 15.245f, 4.184f, 15.573f, 4.513f)
            lineTo(21.487f, 10.427f)
            curveTo(21.816f, 10.755f, 22f, 11.2f, 22f, 11.664f)
            verticalLineTo(18f)
            curveTo(22f, 19.105f, 21.105f, 20f, 20f, 20f)
            horizontalLineTo(11.75f)
            curveTo(11.06f, 20f, 10.5f, 19.44f, 10.5f, 18.75f)
            verticalLineTo(5.25f)
            close()
            moveTo(12f, 5.5f)
            verticalLineTo(18.5f)
            horizontalLineTo(20f)
            curveTo(20.276f, 18.5f, 20.5f, 18.276f, 20.5f, 18f)
            verticalLineTo(12f)
            horizontalLineTo(16f)
            curveTo(14.895f, 12f, 14f, 11.105f, 14f, 10f)
            verticalLineTo(5.5f)
            horizontalLineTo(12f)
            close()
            moveTo(15.5f, 6.561f)
            verticalLineTo(10f)
            curveTo(15.5f, 10.276f, 15.724f, 10.5f, 16f, 10.5f)
            horizontalLineTo(19.439f)
            lineTo(15.5f, 6.561f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentLandscapeSplitHintPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DocumentLandscapeSplitHint, contentDescription = null)
    }
}
