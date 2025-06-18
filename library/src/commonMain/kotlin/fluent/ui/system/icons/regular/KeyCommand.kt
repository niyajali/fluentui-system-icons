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

public val FluentUi.Regular.KeyCommand: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.KeyCommand",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 4.5f)
            curveTo(7.216f, 4.5f, 8f, 5.284f, 8f, 6.25f)
            verticalLineTo(8f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 8f, 4.5f, 7.216f, 4.5f, 6.25f)
            curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
            close()
            moveTo(9.5f, 8f)
            verticalLineTo(6.25f)
            curveTo(9.5f, 4.455f, 8.045f, 3f, 6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            curveTo(3f, 8.045f, 4.455f, 9.5f, 6.25f, 9.5f)
            horizontalLineTo(8f)
            verticalLineTo(14.5f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 14.5f, 3f, 15.955f, 3f, 17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            curveTo(8.045f, 21f, 9.5f, 19.545f, 9.5f, 17.75f)
            verticalLineTo(16f)
            horizontalLineTo(14.5f)
            verticalLineTo(17.75f)
            curveTo(14.5f, 19.545f, 15.955f, 21f, 17.75f, 21f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            curveTo(21f, 15.955f, 19.545f, 14.5f, 17.75f, 14.5f)
            horizontalLineTo(16f)
            verticalLineTo(9.5f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 9.5f, 21f, 8.045f, 21f, 6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            curveTo(15.955f, 3f, 14.5f, 4.455f, 14.5f, 6.25f)
            verticalLineTo(8f)
            horizontalLineTo(9.5f)
            close()
            moveTo(9.5f, 9.5f)
            horizontalLineTo(14.5f)
            verticalLineTo(14.5f)
            horizontalLineTo(9.5f)
            verticalLineTo(9.5f)
            close()
            moveTo(16f, 8f)
            verticalLineTo(6.25f)
            curveTo(16f, 5.284f, 16.784f, 4.5f, 17.75f, 4.5f)
            curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
            curveTo(19.5f, 7.216f, 18.716f, 8f, 17.75f, 8f)
            horizontalLineTo(16f)
            close()
            moveTo(16f, 16f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 16f, 19.5f, 16.784f, 19.5f, 17.75f)
            curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
            curveTo(16.784f, 19.5f, 16f, 18.716f, 16f, 17.75f)
            verticalLineTo(16f)
            close()
            moveTo(8f, 16f)
            verticalLineTo(17.75f)
            curveTo(8f, 18.716f, 7.216f, 19.5f, 6.25f, 19.5f)
            curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
            curveTo(4.5f, 16.784f, 5.284f, 16f, 6.25f, 16f)
            horizontalLineTo(8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun KeyCommandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.KeyCommand, contentDescription = null)
    }
}
