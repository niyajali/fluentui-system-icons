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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.SkipForwardTab: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SkipForwardTab",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 3.25f)
            curveTo(22f, 2.698f, 21.552f, 2.25f, 21f, 2.25f)
            curveTo(20.448f, 2.25f, 20f, 2.698f, 20f, 3.25f)
            verticalLineTo(5.979f)
            curveTo(18.932f, 4.899f, 17.622f, 4.008f, 16.046f, 3.52f)
            curveTo(13.615f, 2.768f, 11.033f, 2.83f, 8.652f, 3.716f)
            curveTo(6.288f, 4.596f, 4.048f, 6.38f, 2.873f, 8.523f)
            curveTo(2.608f, 9.007f, 2.785f, 9.615f, 3.269f, 9.88f)
            curveTo(3.754f, 10.146f, 4.361f, 9.969f, 4.627f, 9.484f)
            curveTo(5.538f, 7.822f, 7.368f, 6.328f, 9.349f, 5.591f)
            curveTo(11.312f, 4.861f, 13.44f, 4.807f, 15.455f, 5.43f)
            curveTo(16.929f, 5.887f, 18.153f, 6.821f, 19.137f, 8f)
            horizontalLineTo(15.75f)
            curveTo(15.198f, 8f, 14.75f, 8.448f, 14.75f, 9f)
            curveTo(14.75f, 9.552f, 15.198f, 10f, 15.75f, 10f)
            horizontalLineTo(21f)
            curveTo(21.552f, 10f, 22f, 9.552f, 22f, 9f)
            verticalLineTo(3.25f)
            close()
            moveTo(6f, 15f)
            curveTo(6f, 13.895f, 6.895f, 13f, 8f, 13f)
            horizontalLineTo(16f)
            curveTo(17.105f, 13f, 18f, 13.895f, 18f, 15f)
            verticalLineTo(19f)
            curveTo(18f, 20.105f, 17.105f, 21f, 16f, 21f)
            horizontalLineTo(8f)
            curveTo(6.895f, 21f, 6f, 20.105f, 6f, 19f)
            verticalLineTo(15f)
            close()
            moveTo(8f, 15.5f)
            verticalLineTo(18.5f)
            curveTo(8f, 18.776f, 8.224f, 19f, 8.5f, 19f)
            horizontalLineTo(15.5f)
            curveTo(15.776f, 19f, 16f, 18.776f, 16f, 18.5f)
            verticalLineTo(15.5f)
            curveTo(16f, 15.224f, 15.776f, 15f, 15.5f, 15f)
            horizontalLineTo(8.5f)
            curveTo(8.224f, 15f, 8f, 15.224f, 8f, 15.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SkipForwardTabPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.SkipForwardTab, contentDescription = null)
    }
}
