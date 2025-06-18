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

public val FluentIcons.Filled.SlideContent: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlideContent",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 6.75f)
            curveTo(2f, 5.231f, 3.231f, 4f, 4.75f, 4f)
            horizontalLineTo(19.25f)
            curveTo(20.769f, 4f, 22f, 5.231f, 22f, 6.75f)
            verticalLineTo(17.25f)
            curveTo(22f, 18.769f, 20.769f, 20f, 19.25f, 20f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 20f, 2f, 18.769f, 2f, 17.25f)
            verticalLineTo(6.75f)
            close()
            moveTo(6.25f, 8f)
            curveTo(5.56f, 8f, 5f, 8.56f, 5f, 9.25f)
            verticalLineTo(14.75f)
            curveTo(5f, 15.44f, 5.56f, 16f, 6.25f, 16f)
            horizontalLineTo(11.75f)
            curveTo(12.44f, 16f, 13f, 15.44f, 13f, 14.75f)
            verticalLineTo(9.25f)
            curveTo(13f, 8.56f, 12.44f, 8f, 11.75f, 8f)
            horizontalLineTo(6.25f)
            close()
            moveTo(14f, 8.75f)
            curveTo(14f, 9.164f, 14.336f, 9.5f, 14.75f, 9.5f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 9.5f, 19f, 9.164f, 19f, 8.75f)
            curveTo(19f, 8.336f, 18.664f, 8f, 18.25f, 8f)
            horizontalLineTo(14.75f)
            curveTo(14.336f, 8f, 14f, 8.336f, 14f, 8.75f)
            close()
            moveTo(14.75f, 11f)
            curveTo(14.336f, 11f, 14f, 11.336f, 14f, 11.75f)
            curveTo(14f, 12.164f, 14.336f, 12.5f, 14.75f, 12.5f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 12.5f, 19f, 12.164f, 19f, 11.75f)
            curveTo(19f, 11.336f, 18.664f, 11f, 18.25f, 11f)
            horizontalLineTo(14.75f)
            close()
            moveTo(14f, 14.75f)
            curveTo(14f, 15.164f, 14.336f, 15.5f, 14.75f, 15.5f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 15.5f, 19f, 15.164f, 19f, 14.75f)
            curveTo(19f, 14.336f, 18.664f, 14f, 18.25f, 14f)
            horizontalLineTo(14.75f)
            curveTo(14.336f, 14f, 14f, 14.336f, 14f, 14.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SlideContentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SlideContent, contentDescription = null)
    }
}
