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

public val FluentIcons.Filled.Headset: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Headset",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5f, 9f)
            curveTo(5f, 5.134f, 8.134f, 2f, 12f, 2f)
            curveTo(15.866f, 2f, 19f, 5.134f, 19f, 9f)
            verticalLineTo(14f)
            curveTo(19f, 15.105f, 18.105f, 16f, 17f, 16f)
            horizontalLineTo(15f)
            curveTo(14.448f, 16f, 14f, 15.552f, 14f, 15f)
            verticalLineTo(11f)
            curveTo(14f, 10.448f, 14.448f, 10f, 15f, 10f)
            horizontalLineTo(17.5f)
            verticalLineTo(9f)
            curveTo(17.5f, 5.962f, 15.038f, 3.5f, 12f, 3.5f)
            curveTo(8.962f, 3.5f, 6.5f, 5.962f, 6.5f, 9f)
            verticalLineTo(10f)
            horizontalLineTo(9f)
            curveTo(9.552f, 10f, 10f, 10.448f, 10f, 11f)
            verticalLineTo(15f)
            curveTo(10f, 15.552f, 9.552f, 16f, 9f, 16f)
            horizontalLineTo(7f)
            curveTo(6.827f, 16f, 6.66f, 15.978f, 6.5f, 15.937f)
            lineTo(6.5f, 16.25f)
            curveTo(6.5f, 17.441f, 7.425f, 18.416f, 8.596f, 18.495f)
            lineTo(8.75f, 18.5f)
            lineTo(9.878f, 18.501f)
            curveTo(10.186f, 17.626f, 11.02f, 17f, 12f, 17f)
            curveTo(13.243f, 17f, 14.25f, 18.007f, 14.25f, 19.25f)
            curveTo(14.25f, 20.493f, 13.243f, 21.5f, 12f, 21.5f)
            curveTo(11.02f, 21.5f, 10.187f, 20.874f, 9.878f, 20f)
            lineTo(8.75f, 20f)
            curveTo(6.746f, 20f, 5.109f, 18.428f, 5.005f, 16.449f)
            lineTo(5f, 16.25f)
            verticalLineTo(9f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HeadsetPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Headset, contentDescription = null)
    }
}
