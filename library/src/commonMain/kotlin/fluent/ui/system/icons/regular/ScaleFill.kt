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

public val FluentIcons.Regular.ScaleFill: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ScaleFill",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6f, 6.75f)
            curveTo(6f, 6.336f, 6.336f, 6f, 6.75f, 6f)
            horizontalLineTo(9.25f)
            curveTo(9.664f, 6f, 10f, 6.336f, 10f, 6.75f)
            curveTo(10f, 7.164f, 9.664f, 7.5f, 9.25f, 7.5f)
            horizontalLineTo(8.561f)
            lineTo(10.28f, 9.22f)
            curveTo(10.573f, 9.513f, 10.573f, 9.987f, 10.28f, 10.28f)
            curveTo(9.987f, 10.573f, 9.513f, 10.573f, 9.22f, 10.28f)
            lineTo(7.5f, 8.561f)
            verticalLineTo(9.251f)
            curveTo(7.5f, 9.665f, 7.164f, 10.001f, 6.75f, 10.001f)
            curveTo(6.336f, 10.001f, 6f, 9.665f, 6f, 9.251f)
            verticalLineTo(6.75f)
            close()
            moveTo(17.25f, 18.001f)
            curveTo(17.449f, 18.001f, 17.64f, 17.922f, 17.781f, 17.781f)
            curveTo(17.921f, 17.641f, 18f, 17.45f, 18f, 17.251f)
            verticalLineTo(14.75f)
            curveTo(18f, 14.336f, 17.665f, 14f, 17.25f, 14f)
            curveTo(16.836f, 14f, 16.5f, 14.336f, 16.5f, 14.75f)
            verticalLineTo(15.44f)
            lineTo(14.78f, 13.72f)
            curveTo(14.487f, 13.427f, 14.012f, 13.427f, 13.72f, 13.72f)
            curveTo(13.427f, 14.012f, 13.427f, 14.487f, 13.719f, 14.78f)
            lineTo(15.44f, 16.501f)
            horizontalLineTo(14.75f)
            curveTo(14.336f, 16.501f, 14f, 16.837f, 14f, 17.251f)
            curveTo(14f, 17.665f, 14.336f, 18.001f, 14.75f, 18.001f)
            horizontalLineTo(17.25f)
            close()
            moveTo(17.781f, 6.22f)
            curveTo(17.921f, 6.361f, 18f, 6.552f, 18f, 6.751f)
            verticalLineTo(9.251f)
            curveTo(18f, 9.665f, 17.665f, 10.001f, 17.25f, 10.001f)
            curveTo(16.836f, 10.001f, 16.5f, 9.665f, 16.5f, 9.251f)
            verticalLineTo(8.561f)
            lineTo(14.78f, 10.28f)
            curveTo(14.487f, 10.573f, 14.012f, 10.573f, 13.719f, 10.28f)
            curveTo(13.427f, 9.987f, 13.427f, 9.512f, 13.72f, 9.22f)
            lineTo(15.439f, 7.501f)
            horizontalLineTo(14.749f)
            curveTo(14.335f, 7.501f, 13.999f, 7.165f, 13.999f, 6.751f)
            curveTo(13.999f, 6.336f, 14.335f, 6.001f, 14.749f, 6.001f)
            lineTo(17.25f, 6.001f)
            curveTo(17.449f, 6.001f, 17.64f, 6.08f, 17.781f, 6.22f)
            close()
            moveTo(6f, 17.25f)
            curveTo(6f, 17.449f, 6.079f, 17.64f, 6.22f, 17.781f)
            curveTo(6.36f, 17.921f, 6.551f, 18f, 6.75f, 18f)
            horizontalLineTo(9.251f)
            curveTo(9.665f, 18f, 10.001f, 17.665f, 10.001f, 17.25f)
            curveTo(10.001f, 16.836f, 9.665f, 16.5f, 9.251f, 16.5f)
            horizontalLineTo(8.56f)
            lineTo(10.28f, 14.78f)
            curveTo(10.573f, 14.487f, 10.573f, 14.012f, 10.28f, 13.72f)
            curveTo(9.987f, 13.427f, 9.512f, 13.427f, 9.22f, 13.72f)
            lineTo(7.5f, 15.44f)
            verticalLineTo(14.75f)
            curveTo(7.5f, 14.336f, 7.164f, 14f, 6.75f, 14f)
            curveTo(6.336f, 14f, 6f, 14.336f, 6f, 14.75f)
            lineTo(6f, 17.25f)
            close()
            moveTo(3f, 5.25f)
            curveTo(3f, 4.007f, 4.007f, 3f, 5.25f, 3f)
            horizontalLineTo(18.75f)
            curveTo(19.993f, 3f, 21f, 4.007f, 21f, 5.25f)
            verticalLineTo(18.75f)
            curveTo(21f, 19.993f, 19.993f, 21f, 18.75f, 21f)
            horizontalLineTo(5.25f)
            curveTo(4.007f, 21f, 3f, 19.993f, 3f, 18.75f)
            verticalLineTo(5.25f)
            close()
            moveTo(5.25f, 4.5f)
            curveTo(4.836f, 4.5f, 4.5f, 4.836f, 4.5f, 5.25f)
            verticalLineTo(18.75f)
            curveTo(4.5f, 19.164f, 4.836f, 19.5f, 5.25f, 19.5f)
            horizontalLineTo(18.75f)
            curveTo(19.164f, 19.5f, 19.5f, 19.164f, 19.5f, 18.75f)
            verticalLineTo(5.25f)
            curveTo(19.5f, 4.836f, 19.164f, 4.5f, 18.75f, 4.5f)
            horizontalLineTo(5.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ScaleFillPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ScaleFill, contentDescription = null)
    }
}
