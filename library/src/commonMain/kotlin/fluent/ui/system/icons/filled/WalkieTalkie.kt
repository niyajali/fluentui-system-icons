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

public val FluentIcons.Filled.WalkieTalkie: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WalkieTalkie",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.5f, 7.5f)
            verticalLineTo(10.5f)
            horizontalLineTo(14.5f)
            verticalLineTo(7.5f)
            horizontalLineTo(9.5f)
            close()
            moveTo(8.75f, 1f)
            curveTo(9.164f, 1f, 9.5f, 1.336f, 9.5f, 1.75f)
            verticalLineTo(3f)
            horizontalLineTo(16.75f)
            curveTo(17.993f, 3f, 19f, 4.007f, 19f, 5.25f)
            verticalLineTo(14f)
            curveTo(19f, 14.189f, 18.929f, 14.37f, 18.801f, 14.509f)
            lineTo(17.5f, 15.918f)
            verticalLineTo(19.75f)
            curveTo(17.5f, 20.993f, 16.493f, 22f, 15.25f, 22f)
            horizontalLineTo(8.751f)
            curveTo(7.508f, 22f, 6.501f, 20.993f, 6.501f, 19.75f)
            verticalLineTo(15.918f)
            lineTo(5.199f, 14.509f)
            curveTo(5.071f, 14.37f, 5f, 14.189f, 5f, 14f)
            verticalLineTo(5.25f)
            curveTo(5f, 4.007f, 6.007f, 3f, 7.25f, 3f)
            horizontalLineTo(8f)
            verticalLineTo(1.75f)
            curveTo(8f, 1.336f, 8.336f, 1f, 8.75f, 1f)
            close()
            moveTo(8f, 6.75f)
            verticalLineTo(11.25f)
            curveTo(8f, 11.664f, 8.336f, 12f, 8.75f, 12f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 12f, 16f, 11.664f, 16f, 11.25f)
            verticalLineTo(6.75f)
            curveTo(16f, 6.336f, 15.664f, 6f, 15.25f, 6f)
            horizontalLineTo(8.75f)
            curveTo(8.336f, 6f, 8f, 6.336f, 8f, 6.75f)
            close()
            moveTo(9.5f, 14.75f)
            curveTo(9.5f, 15.164f, 9.836f, 15.5f, 10.25f, 15.5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 15.5f, 14.5f, 15.164f, 14.5f, 14.75f)
            curveTo(14.5f, 14.336f, 14.164f, 14f, 13.75f, 14f)
            horizontalLineTo(10.25f)
            curveTo(9.836f, 14f, 9.5f, 14.336f, 9.5f, 14.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WalkieTalkiePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WalkieTalkie, contentDescription = null)
    }
}
