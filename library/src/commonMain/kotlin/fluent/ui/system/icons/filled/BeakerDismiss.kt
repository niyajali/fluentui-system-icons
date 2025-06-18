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

public val FluentIcons.Filled.BeakerDismiss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BeakerDismiss",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.999f, 4.5f)
            verticalLineTo(10.738f)
            curveTo(8.999f, 11.113f, 8.906f, 11.482f, 8.727f, 11.812f)
            lineTo(7.539f, 14f)
            horizontalLineTo(12.021f)
            curveTo(12.754f, 12.856f, 13.835f, 11.956f, 15.115f, 11.451f)
            curveTo(15.039f, 11.222f, 15f, 10.981f, 15f, 10.738f)
            verticalLineTo(4.5f)
            horizontalLineTo(16f)
            curveTo(16.414f, 4.5f, 16.75f, 4.164f, 16.75f, 3.75f)
            curveTo(16.75f, 3.336f, 16.414f, 3f, 16f, 3f)
            horizontalLineTo(8f)
            curveTo(7.585f, 3f, 7.25f, 3.336f, 7.25f, 3.75f)
            curveTo(7.25f, 4.164f, 7.585f, 4.5f, 8f, 4.5f)
            horizontalLineTo(8.999f)
            close()
            moveTo(6.725f, 15.5f)
            horizontalLineTo(11.313f)
            curveTo(11.109f, 16.13f, 11f, 16.802f, 11f, 17.5f)
            curveTo(11f, 18.789f, 11.375f, 19.99f, 12.021f, 21f)
            horizontalLineTo(6.68f)
            curveTo(5.353f, 21f, 4.509f, 19.581f, 5.142f, 18.415f)
            lineTo(6.725f, 15.5f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 14.462f, 20.537f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            curveTo(20.537f, 23f, 23f, 20.538f, 23f, 17.5f)
            close()
            moveTo(15.023f, 15.024f)
            lineTo(15.093f, 14.966f)
            lineTo(15.169f, 14.923f)
            curveTo(15.327f, 14.851f, 15.515f, 14.865f, 15.661f, 14.966f)
            lineTo(15.73f, 15.024f)
            lineTo(17.5f, 16.794f)
            lineTo(19.272f, 15.024f)
            lineTo(19.341f, 14.966f)
            curveTo(19.511f, 14.848f, 19.739f, 14.848f, 19.91f, 14.966f)
            lineTo(19.979f, 15.024f)
            lineTo(20.037f, 15.093f)
            curveTo(20.155f, 15.264f, 20.155f, 15.491f, 20.037f, 15.662f)
            lineTo(19.979f, 15.731f)
            lineTo(18.207f, 17.501f)
            lineTo(19.976f, 19.27f)
            lineTo(20.034f, 19.339f)
            curveTo(20.152f, 19.51f, 20.152f, 19.737f, 20.034f, 19.908f)
            lineTo(19.976f, 19.977f)
            lineTo(19.907f, 20.035f)
            curveTo(19.736f, 20.153f, 19.509f, 20.153f, 19.338f, 20.035f)
            lineTo(19.269f, 19.977f)
            lineTo(17.5f, 18.208f)
            lineTo(15.733f, 19.975f)
            lineTo(15.664f, 20.032f)
            curveTo(15.493f, 20.151f, 15.266f, 20.151f, 15.095f, 20.032f)
            lineTo(15.026f, 19.975f)
            lineTo(14.968f, 19.905f)
            curveTo(14.85f, 19.735f, 14.85f, 19.507f, 14.968f, 19.337f)
            lineTo(15.026f, 19.267f)
            lineTo(16.793f, 17.501f)
            lineTo(15.023f, 15.731f)
            lineTo(14.965f, 15.662f)
            curveTo(14.847f, 15.491f, 14.847f, 15.264f, 14.965f, 15.093f)
            lineTo(15.023f, 15.024f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BeakerDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BeakerDismiss, contentDescription = null)
    }
}
