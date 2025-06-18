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

public val FluentIcons.Regular.ArrowHookUpLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowHookUpLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7f, 19.25f)
            curveTo(7f, 19.664f, 7.336f, 20f, 7.75f, 20f)
            horizontalLineTo(14f)
            curveTo(15.979f, 20f, 17.504f, 19.177f, 18.52f, 17.926f)
            curveTo(19.521f, 16.693f, 20f, 15.08f, 20f, 13.5f)
            curveTo(20f, 11.92f, 19.521f, 10.307f, 18.52f, 9.074f)
            curveTo(17.504f, 7.823f, 15.979f, 7f, 14f, 7f)
            horizontalLineTo(7.561f)
            lineTo(10.03f, 4.53f)
            curveTo(10.323f, 4.237f, 10.323f, 3.763f, 10.03f, 3.47f)
            curveTo(9.737f, 3.177f, 9.263f, 3.177f, 8.97f, 3.47f)
            lineTo(5.22f, 7.22f)
            curveTo(4.927f, 7.513f, 4.927f, 7.987f, 5.22f, 8.28f)
            lineTo(8.97f, 12.03f)
            curveTo(9.263f, 12.323f, 9.737f, 12.323f, 10.03f, 12.03f)
            curveTo(10.323f, 11.737f, 10.323f, 11.263f, 10.03f, 10.97f)
            lineTo(7.561f, 8.5f)
            horizontalLineTo(14f)
            curveTo(15.521f, 8.5f, 16.621f, 9.115f, 17.355f, 10.019f)
            curveTo(18.104f, 10.943f, 18.5f, 12.205f, 18.5f, 13.5f)
            curveTo(18.5f, 14.795f, 18.104f, 16.057f, 17.355f, 16.98f)
            curveTo(16.621f, 17.885f, 15.521f, 18.5f, 14f, 18.5f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 18.5f, 7f, 18.836f, 7f, 19.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowHookUpLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowHookUpLeft, contentDescription = null)
    }
}
