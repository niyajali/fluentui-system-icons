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

public val FluentUi.Regular.Clover: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Clover",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.75f, 2f)
            curveTo(4.127f, 2f, 2f, 4.127f, 2f, 6.75f)
            curveTo(2f, 9.373f, 4.127f, 11.5f, 6.75f, 11.5f)
            horizontalLineTo(10.75f)
            curveTo(11.164f, 11.5f, 11.5f, 11.164f, 11.5f, 10.75f)
            verticalLineTo(6.75f)
            curveTo(11.5f, 4.127f, 9.373f, 2f, 6.75f, 2f)
            close()
            moveTo(3.5f, 6.75f)
            curveTo(3.5f, 4.955f, 4.955f, 3.5f, 6.75f, 3.5f)
            curveTo(8.545f, 3.5f, 10f, 4.955f, 10f, 6.75f)
            verticalLineTo(10f)
            horizontalLineTo(6.75f)
            curveTo(4.955f, 10f, 3.5f, 8.545f, 3.5f, 6.75f)
            close()
            moveTo(6.75f, 22f)
            curveTo(4.127f, 22f, 2f, 19.873f, 2f, 17.25f)
            curveTo(2f, 14.627f, 4.127f, 12.5f, 6.75f, 12.5f)
            horizontalLineTo(10.75f)
            curveTo(11.164f, 12.5f, 11.5f, 12.836f, 11.5f, 13.25f)
            verticalLineTo(17.25f)
            curveTo(11.5f, 19.873f, 9.373f, 22f, 6.75f, 22f)
            close()
            moveTo(3.5f, 17.25f)
            curveTo(3.5f, 19.045f, 4.955f, 20.5f, 6.75f, 20.5f)
            curveTo(8.545f, 20.5f, 10f, 19.045f, 10f, 17.25f)
            verticalLineTo(14f)
            horizontalLineTo(6.75f)
            curveTo(4.955f, 14f, 3.5f, 15.455f, 3.5f, 17.25f)
            close()
            moveTo(22f, 6.75f)
            curveTo(22f, 4.127f, 19.873f, 2f, 17.25f, 2f)
            curveTo(14.627f, 2f, 12.5f, 4.127f, 12.5f, 6.75f)
            verticalLineTo(10.75f)
            curveTo(12.5f, 11.164f, 12.836f, 11.5f, 13.25f, 11.5f)
            horizontalLineTo(17.25f)
            curveTo(19.873f, 11.5f, 22f, 9.373f, 22f, 6.75f)
            close()
            moveTo(17.25f, 3.5f)
            curveTo(19.045f, 3.5f, 20.5f, 4.955f, 20.5f, 6.75f)
            curveTo(20.5f, 8.545f, 19.045f, 10f, 17.25f, 10f)
            horizontalLineTo(14f)
            verticalLineTo(6.75f)
            curveTo(14f, 4.955f, 15.455f, 3.5f, 17.25f, 3.5f)
            close()
            moveTo(17.25f, 22f)
            curveTo(19.873f, 22f, 22f, 19.873f, 22f, 17.25f)
            curveTo(22f, 14.627f, 19.873f, 12.5f, 17.25f, 12.5f)
            horizontalLineTo(13.25f)
            curveTo(12.836f, 12.5f, 12.5f, 12.836f, 12.5f, 13.25f)
            verticalLineTo(17.25f)
            curveTo(12.5f, 19.873f, 14.627f, 22f, 17.25f, 22f)
            close()
            moveTo(20.5f, 17.25f)
            curveTo(20.5f, 19.045f, 19.045f, 20.5f, 17.25f, 20.5f)
            curveTo(15.455f, 20.5f, 14f, 19.045f, 14f, 17.25f)
            verticalLineTo(14f)
            horizontalLineTo(17.25f)
            curveTo(19.045f, 14f, 20.5f, 15.455f, 20.5f, 17.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CloverPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Clover, contentDescription = null)
    }
}
