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

public val FluentIcons.Filled.SlideLayout: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlideLayout",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.5f, 8.75f)
            curveTo(6.5f, 8.612f, 6.612f, 8.5f, 6.75f, 8.5f)
            horizontalLineTo(17.25f)
            curveTo(17.388f, 8.5f, 17.5f, 8.612f, 17.5f, 8.75f)
            verticalLineTo(10.5f)
            horizontalLineTo(6.5f)
            verticalLineTo(8.75f)
            close()
            moveTo(6.5f, 12f)
            verticalLineTo(15.25f)
            curveTo(6.5f, 15.388f, 6.612f, 15.5f, 6.75f, 15.5f)
            horizontalLineTo(9f)
            verticalLineTo(12f)
            horizontalLineTo(6.5f)
            close()
            moveTo(17.25f, 15.5f)
            horizontalLineTo(10.5f)
            verticalLineTo(12f)
            horizontalLineTo(17.5f)
            verticalLineTo(15.25f)
            curveTo(17.5f, 15.388f, 17.388f, 15.5f, 17.25f, 15.5f)
            close()
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
            moveTo(6.75f, 7f)
            curveTo(5.784f, 7f, 5f, 7.784f, 5f, 8.75f)
            verticalLineTo(15.25f)
            curveTo(5f, 16.216f, 5.784f, 17f, 6.75f, 17f)
            horizontalLineTo(17.25f)
            curveTo(18.216f, 17f, 19f, 16.216f, 19f, 15.25f)
            verticalLineTo(8.75f)
            curveTo(19f, 7.784f, 18.216f, 7f, 17.25f, 7f)
            horizontalLineTo(6.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SlideLayoutPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SlideLayout, contentDescription = null)
    }
}
