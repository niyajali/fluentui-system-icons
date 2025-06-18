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

public val FluentIcons.Filled.MailInboxArrowUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailInboxArrowUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.499f, 3.999f)
            curveTo(10.301f, 4.474f, 10.157f, 4.977f, 10.076f, 5.5f)
            lineTo(6.25f, 5.5f)
            curveTo(5.284f, 5.5f, 4.5f, 6.284f, 4.5f, 7.25f)
            verticalLineTo(14f)
            horizontalLineTo(9f)
            curveTo(9.38f, 14f, 9.693f, 14.282f, 9.743f, 14.648f)
            lineTo(9.75f, 14.75f)
            curveTo(9.75f, 15.993f, 10.757f, 17f, 12f, 17f)
            curveTo(13.243f, 17f, 14.25f, 15.993f, 14.25f, 14.75f)
            curveTo(14.25f, 14.336f, 14.586f, 14f, 15f, 14f)
            horizontalLineTo(19.5f)
            lineTo(19.501f, 12.267f)
            curveTo(20.052f, 11.98f, 20.557f, 11.616f, 21.001f, 11.19f)
            lineTo(21f, 18.75f)
            curveTo(21f, 20.545f, 19.545f, 22f, 17.75f, 22f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 22f, 3f, 20.545f, 3f, 18.75f)
            verticalLineTo(7.25f)
            curveTo(3f, 5.455f, 4.455f, 4f, 6.25f, 4f)
            lineTo(10.499f, 3.999f)
            close()
            moveTo(16.5f, 1f)
            curveTo(19.538f, 1f, 22f, 3.462f, 22f, 6.5f)
            curveTo(22f, 9.538f, 19.538f, 12f, 16.5f, 12f)
            curveTo(13.462f, 12f, 11f, 9.538f, 11f, 6.5f)
            curveTo(11f, 3.462f, 13.462f, 1f, 16.5f, 1f)
            close()
            moveTo(16.628f, 3.017f)
            lineTo(16.542f, 3.002f)
            lineTo(16.488f, 3f)
            lineTo(16.432f, 3.005f)
            lineTo(16.372f, 3.017f)
            lineTo(16.289f, 3.047f)
            lineTo(16.215f, 3.089f)
            lineTo(16.159f, 3.134f)
            lineTo(13.646f, 5.646f)
            lineTo(13.589f, 5.716f)
            curveTo(13.47f, 5.886f, 13.47f, 6.114f, 13.589f, 6.284f)
            lineTo(13.646f, 6.354f)
            lineTo(13.716f, 6.411f)
            curveTo(13.886f, 6.53f, 14.114f, 6.53f, 14.284f, 6.411f)
            lineTo(14.354f, 6.354f)
            lineTo(15.999f, 4.708f)
            lineTo(16f, 10f)
            lineTo(16.008f, 10.09f)
            curveTo(16.045f, 10.294f, 16.206f, 10.455f, 16.41f, 10.492f)
            lineTo(16.5f, 10.5f)
            lineTo(16.59f, 10.492f)
            curveTo(16.794f, 10.455f, 16.955f, 10.294f, 16.992f, 10.09f)
            lineTo(17f, 10f)
            lineTo(16.999f, 4.706f)
            lineTo(18.646f, 6.354f)
            lineTo(18.716f, 6.411f)
            curveTo(18.911f, 6.546f, 19.18f, 6.527f, 19.354f, 6.354f)
            curveTo(19.527f, 6.18f, 19.546f, 5.911f, 19.411f, 5.716f)
            lineTo(19.354f, 5.646f)
            lineTo(16.806f, 3.104f)
            lineTo(16.758f, 3.072f)
            lineTo(16.691f, 3.038f)
            lineTo(16.628f, 3.017f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailInboxArrowUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MailInboxArrowUp, contentDescription = null)
    }
}
