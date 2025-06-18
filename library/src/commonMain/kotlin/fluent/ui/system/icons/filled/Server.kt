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

public val FluentIcons.Filled.Server: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Server",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9f, 2f)
            curveTo(7.343f, 2f, 6f, 3.343f, 6f, 5f)
            verticalLineTo(19f)
            curveTo(6f, 20.657f, 7.343f, 22f, 9f, 22f)
            horizontalLineTo(15f)
            curveTo(16.657f, 22f, 18f, 20.657f, 18f, 19f)
            verticalLineTo(5f)
            curveTo(18f, 3.343f, 16.657f, 2f, 15f, 2f)
            horizontalLineTo(9f)
            close()
            moveTo(8.5f, 6.75f)
            curveTo(8.5f, 6.336f, 8.836f, 6f, 9.25f, 6f)
            horizontalLineTo(14.75f)
            curveTo(15.164f, 6f, 15.5f, 6.336f, 15.5f, 6.75f)
            curveTo(15.5f, 7.164f, 15.164f, 7.5f, 14.75f, 7.5f)
            horizontalLineTo(9.25f)
            curveTo(8.836f, 7.5f, 8.5f, 7.164f, 8.5f, 6.75f)
            close()
            moveTo(8.5f, 17.75f)
            curveTo(8.5f, 17.336f, 8.836f, 17f, 9.25f, 17f)
            horizontalLineTo(14.75f)
            curveTo(15.164f, 17f, 15.5f, 17.336f, 15.5f, 17.75f)
            curveTo(15.5f, 18.164f, 15.164f, 18.5f, 14.75f, 18.5f)
            horizontalLineTo(9.25f)
            curveTo(8.836f, 18.5f, 8.5f, 18.164f, 8.5f, 17.75f)
            close()
            moveTo(8.5f, 14.75f)
            curveTo(8.5f, 14.336f, 8.836f, 14f, 9.25f, 14f)
            horizontalLineTo(14.75f)
            curveTo(15.164f, 14f, 15.5f, 14.336f, 15.5f, 14.75f)
            curveTo(15.5f, 15.164f, 15.164f, 15.5f, 14.75f, 15.5f)
            horizontalLineTo(9.25f)
            curveTo(8.836f, 15.5f, 8.5f, 15.164f, 8.5f, 14.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ServerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Server, contentDescription = null)
    }
}
