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

public val FluentIcons.Regular.ArrowHookDownLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowHookDownLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7f, 4.75f)
            curveTo(7f, 4.336f, 7.336f, 4f, 7.75f, 4f)
            horizontalLineTo(14f)
            curveTo(15.979f, 4f, 17.504f, 4.823f, 18.52f, 6.074f)
            curveTo(19.521f, 7.307f, 20f, 8.92f, 20f, 10.5f)
            curveTo(20f, 12.08f, 19.521f, 13.693f, 18.52f, 14.926f)
            curveTo(17.504f, 16.177f, 15.979f, 17f, 14f, 17f)
            horizontalLineTo(7.561f)
            lineTo(10.03f, 19.47f)
            curveTo(10.323f, 19.763f, 10.323f, 20.237f, 10.03f, 20.53f)
            curveTo(9.737f, 20.823f, 9.263f, 20.823f, 8.97f, 20.53f)
            lineTo(5.22f, 16.78f)
            curveTo(4.927f, 16.487f, 4.927f, 16.013f, 5.22f, 15.72f)
            lineTo(8.97f, 11.97f)
            curveTo(9.263f, 11.677f, 9.737f, 11.677f, 10.03f, 11.97f)
            curveTo(10.323f, 12.263f, 10.323f, 12.737f, 10.03f, 13.03f)
            lineTo(7.561f, 15.5f)
            horizontalLineTo(14f)
            curveTo(15.521f, 15.5f, 16.621f, 14.885f, 17.355f, 13.981f)
            curveTo(18.104f, 13.057f, 18.5f, 11.795f, 18.5f, 10.5f)
            curveTo(18.5f, 9.205f, 18.104f, 7.943f, 17.355f, 7.019f)
            curveTo(16.621f, 6.115f, 15.521f, 5.5f, 14f, 5.5f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 5.5f, 7f, 5.164f, 7f, 4.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowHookDownLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowHookDownLeft, contentDescription = null)
    }
}
