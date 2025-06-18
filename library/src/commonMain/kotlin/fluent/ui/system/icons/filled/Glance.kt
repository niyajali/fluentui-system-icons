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

public val FluentIcons.Filled.Glance: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Glance",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.25f, 11.002f)
            curveTo(20.217f, 11.002f, 21f, 11.785f, 21f, 12.752f)
            verticalLineTo(19.252f)
            curveTo(21f, 20.218f, 20.217f, 21.002f, 19.25f, 21.002f)
            horizontalLineTo(14.75f)
            curveTo(13.784f, 21.002f, 13f, 20.218f, 13f, 19.252f)
            verticalLineTo(12.752f)
            curveTo(13f, 11.785f, 13.784f, 11.002f, 14.75f, 11.002f)
            horizontalLineTo(19.25f)
            close()
            moveTo(9.268f, 15.014f)
            curveTo(10.235f, 15.014f, 11.018f, 15.798f, 11.018f, 16.764f)
            verticalLineTo(19.252f)
            curveTo(11.018f, 20.218f, 10.235f, 21.002f, 9.268f, 21.002f)
            horizontalLineTo(4.754f)
            curveTo(3.787f, 21.002f, 3.004f, 20.218f, 3.004f, 19.252f)
            verticalLineTo(16.764f)
            curveTo(3.004f, 15.798f, 3.787f, 15.014f, 4.754f, 15.014f)
            horizontalLineTo(9.268f)
            close()
            moveTo(9.254f, 3f)
            curveTo(10.22f, 3f, 11.004f, 3.783f, 11.004f, 4.75f)
            verticalLineTo(11.25f)
            curveTo(11.004f, 12.168f, 10.297f, 12.921f, 9.397f, 12.994f)
            lineTo(9.254f, 13f)
            horizontalLineTo(4.754f)
            curveTo(3.787f, 13f, 3.004f, 12.217f, 3.004f, 11.25f)
            verticalLineTo(4.75f)
            curveTo(3.004f, 3.783f, 3.787f, 3f, 4.754f, 3f)
            horizontalLineTo(9.254f)
            close()
            moveTo(19.25f, 3f)
            curveTo(20.217f, 3f, 21f, 3.783f, 21f, 4.75f)
            verticalLineTo(7.25f)
            curveTo(21f, 8.217f, 20.217f, 9f, 19.25f, 9f)
            horizontalLineTo(14.75f)
            curveTo(13.784f, 9f, 13f, 8.217f, 13f, 7.25f)
            verticalLineTo(4.75f)
            curveTo(13f, 3.783f, 13.784f, 3f, 14.75f, 3f)
            horizontalLineTo(19.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GlancePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Glance, contentDescription = null)
    }
}
