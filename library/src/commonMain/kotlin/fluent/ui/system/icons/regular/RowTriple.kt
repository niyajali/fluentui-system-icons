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

public val FluentIcons.Regular.RowTriple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.RowTriple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 3.77f)
            curveTo(4f, 2.803f, 4.784f, 2.02f, 5.75f, 2.02f)
            horizontalLineTo(18.25f)
            curveTo(19.216f, 2.02f, 20f, 2.803f, 20f, 3.77f)
            verticalLineTo(6.27f)
            curveTo(20f, 7.236f, 19.216f, 8.02f, 18.25f, 8.02f)
            horizontalLineTo(5.75f)
            curveTo(4.784f, 8.02f, 4f, 7.236f, 4f, 6.27f)
            verticalLineTo(3.77f)
            close()
            moveTo(5.75f, 3.52f)
            curveTo(5.612f, 3.52f, 5.5f, 3.631f, 5.5f, 3.77f)
            verticalLineTo(6.27f)
            curveTo(5.5f, 6.408f, 5.612f, 6.52f, 5.75f, 6.52f)
            horizontalLineTo(18.25f)
            curveTo(18.388f, 6.52f, 18.5f, 6.408f, 18.5f, 6.27f)
            verticalLineTo(3.77f)
            curveTo(18.5f, 3.631f, 18.388f, 3.52f, 18.25f, 3.52f)
            horizontalLineTo(5.75f)
            close()
            moveTo(4f, 10.769f)
            curveTo(4f, 9.803f, 4.784f, 9.02f, 5.75f, 9.02f)
            horizontalLineTo(18.25f)
            curveTo(19.216f, 9.02f, 20f, 9.803f, 20f, 10.769f)
            verticalLineTo(13.269f)
            curveTo(20f, 14.236f, 19.216f, 15.019f, 18.25f, 15.019f)
            horizontalLineTo(5.75f)
            curveTo(4.784f, 15.019f, 4f, 14.236f, 4f, 13.269f)
            verticalLineTo(10.769f)
            close()
            moveTo(5.75f, 10.519f)
            curveTo(5.612f, 10.519f, 5.5f, 10.632f, 5.5f, 10.769f)
            verticalLineTo(13.269f)
            curveTo(5.5f, 13.408f, 5.612f, 13.519f, 5.75f, 13.519f)
            horizontalLineTo(18.25f)
            curveTo(18.388f, 13.519f, 18.5f, 13.408f, 18.5f, 13.269f)
            verticalLineTo(10.769f)
            curveTo(18.5f, 10.632f, 18.388f, 10.519f, 18.25f, 10.519f)
            horizontalLineTo(5.75f)
            close()
            moveTo(5.75f, 16.02f)
            curveTo(4.784f, 16.02f, 4f, 16.803f, 4f, 17.77f)
            verticalLineTo(20.27f)
            curveTo(4f, 21.236f, 4.784f, 22.02f, 5.75f, 22.02f)
            horizontalLineTo(18.25f)
            curveTo(19.216f, 22.02f, 20f, 21.236f, 20f, 20.27f)
            verticalLineTo(17.77f)
            curveTo(20f, 16.803f, 19.216f, 16.02f, 18.25f, 16.02f)
            horizontalLineTo(5.75f)
            close()
            moveTo(5.5f, 17.77f)
            curveTo(5.5f, 17.632f, 5.612f, 17.52f, 5.75f, 17.52f)
            horizontalLineTo(18.25f)
            curveTo(18.388f, 17.52f, 18.5f, 17.632f, 18.5f, 17.77f)
            verticalLineTo(20.27f)
            curveTo(18.5f, 20.408f, 18.388f, 20.52f, 18.25f, 20.52f)
            horizontalLineTo(5.75f)
            curveTo(5.612f, 20.52f, 5.5f, 20.408f, 5.5f, 20.27f)
            verticalLineTo(17.77f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RowTriplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.RowTriple, contentDescription = null)
    }
}
