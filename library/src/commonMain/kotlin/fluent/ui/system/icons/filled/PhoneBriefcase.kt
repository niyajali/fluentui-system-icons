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

public val FluentIcons.Filled.PhoneBriefcase: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneBriefcase",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.75f, 2f)
            curveTo(14.993f, 2f, 16f, 3.007f, 16f, 4.25f)
            verticalLineTo(11f)
            horizontalLineTo(15.75f)
            curveTo(14.231f, 11f, 13f, 12.231f, 13f, 13.75f)
            verticalLineTo(14.05f)
            curveTo(11.859f, 14.282f, 11f, 15.291f, 11f, 16.5f)
            verticalLineTo(18f)
            horizontalLineTo(8.75f)
            curveTo(8.336f, 18f, 8f, 18.336f, 8f, 18.75f)
            curveTo(8f, 19.164f, 8.336f, 19.5f, 8.75f, 19.5f)
            horizontalLineTo(11f)
            verticalLineTo(21.5f)
            curveTo(11f, 21.671f, 11.017f, 21.838f, 11.05f, 22f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineTo(13.75f)
            close()
            moveTo(14f, 13.75f)
            verticalLineTo(15f)
            horizontalLineTo(13.5f)
            curveTo(12.672f, 15f, 12f, 15.672f, 12f, 16.5f)
            verticalLineTo(21.5f)
            curveTo(12f, 22.328f, 12.672f, 23f, 13.5f, 23f)
            horizontalLineTo(21.5f)
            curveTo(22.328f, 23f, 23f, 22.328f, 23f, 21.5f)
            verticalLineTo(16.5f)
            curveTo(23f, 15.672f, 22.328f, 15f, 21.5f, 15f)
            horizontalLineTo(21f)
            verticalLineTo(13.75f)
            curveTo(21f, 12.783f, 20.216f, 12f, 19.25f, 12f)
            horizontalLineTo(15.75f)
            curveTo(14.783f, 12f, 14f, 12.783f, 14f, 13.75f)
            close()
            moveTo(15.5f, 13.75f)
            curveTo(15.5f, 13.612f, 15.612f, 13.5f, 15.75f, 13.5f)
            horizontalLineTo(19.25f)
            curveTo(19.388f, 13.5f, 19.5f, 13.612f, 19.5f, 13.75f)
            verticalLineTo(15f)
            horizontalLineTo(15.5f)
            verticalLineTo(13.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PhoneBriefcasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PhoneBriefcase, contentDescription = null)
    }
}
