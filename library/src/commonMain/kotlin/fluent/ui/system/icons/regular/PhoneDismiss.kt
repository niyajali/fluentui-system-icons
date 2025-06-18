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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.PhoneDismiss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PhoneDismiss",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            close()
            moveTo(13.75f, 2f)
            curveTo(14.993f, 2f, 16f, 3.007f, 16f, 4.25f)
            lineTo(16f, 11.174f)
            curveTo(15.472f, 11.299f, 14.969f, 11.488f, 14.5f, 11.732f)
            lineTo(14.5f, 4.25f)
            curveTo(14.5f, 3.836f, 14.164f, 3.5f, 13.75f, 3.5f)
            horizontalLineTo(6.25f)
            curveTo(5.836f, 3.5f, 5.5f, 3.836f, 5.5f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(5.5f, 20.164f, 5.836f, 20.5f, 6.25f, 20.5f)
            lineTo(11.733f, 20.501f)
            curveTo(12.02f, 21.052f, 12.384f, 21.557f, 12.81f, 22.001f)
            lineTo(6.25f, 22f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineTo(13.75f)
            close()
            moveTo(15.093f, 14.966f)
            lineTo(15.024f, 15.024f)
            lineTo(14.966f, 15.093f)
            curveTo(14.848f, 15.264f, 14.848f, 15.491f, 14.966f, 15.662f)
            lineTo(15.024f, 15.731f)
            lineTo(16.793f, 17.501f)
            lineTo(15.026f, 19.267f)
            lineTo(14.969f, 19.337f)
            curveTo(14.85f, 19.507f, 14.85f, 19.735f, 14.969f, 19.905f)
            lineTo(15.026f, 19.975f)
            lineTo(15.096f, 20.032f)
            curveTo(15.266f, 20.151f, 15.494f, 20.151f, 15.664f, 20.032f)
            lineTo(15.733f, 19.975f)
            lineTo(17.5f, 18.208f)
            lineTo(19.269f, 19.977f)
            lineTo(19.339f, 20.035f)
            curveTo(19.509f, 20.153f, 19.737f, 20.153f, 19.907f, 20.035f)
            lineTo(19.976f, 19.977f)
            lineTo(20.034f, 19.908f)
            curveTo(20.153f, 19.737f, 20.153f, 19.51f, 20.034f, 19.339f)
            lineTo(19.976f, 19.27f)
            lineTo(18.207f, 17.501f)
            lineTo(19.979f, 15.731f)
            lineTo(20.037f, 15.662f)
            curveTo(20.155f, 15.491f, 20.155f, 15.264f, 20.037f, 15.093f)
            lineTo(19.979f, 15.024f)
            lineTo(19.91f, 14.966f)
            curveTo(19.74f, 14.848f, 19.512f, 14.848f, 19.341f, 14.966f)
            lineTo(19.272f, 15.024f)
            lineTo(17.5f, 16.794f)
            lineTo(15.731f, 15.024f)
            lineTo(15.662f, 14.966f)
            curveTo(15.516f, 14.865f, 15.327f, 14.851f, 15.169f, 14.923f)
            lineTo(15.093f, 14.966f)
            close()
            moveTo(8.749f, 17.504f)
            lineTo(11f, 17.499f)
            curveTo(11f, 18.016f, 11.06f, 18.518f, 11.174f, 19f)
            lineTo(8.751f, 19.004f)
            curveTo(8.337f, 19.004f, 8.001f, 18.669f, 8f, 18.255f)
            curveTo(7.999f, 17.841f, 8.335f, 17.504f, 8.749f, 17.504f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PhoneDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PhoneDismiss, contentDescription = null)
    }
}
