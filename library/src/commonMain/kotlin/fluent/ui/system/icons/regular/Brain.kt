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

public val FluentIcons.Regular.Brain: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Brain",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.5f, 2f)
            curveTo(16.14f, 2f, 17.496f, 3.215f, 17.718f, 4.795f)
            curveTo(19.576f, 5.08f, 21f, 6.686f, 21f, 8.625f)
            curveTo(21f, 9.728f, 20.538f, 10.722f, 19.799f, 11.428f)
            curveTo(21.104f, 12.086f, 22f, 13.438f, 22f, 15f)
            verticalLineTo(15.25f)
            curveTo(22f, 17.244f, 20.541f, 18.896f, 18.633f, 19.199f)
            curveTo(18.201f, 20.813f, 16.732f, 22f, 15.006f, 22f)
            curveTo(13.778f, 22f, 12.686f, 21.409f, 12f, 20.496f)
            curveTo(11.314f, 21.409f, 10.222f, 22f, 8.994f, 22f)
            curveTo(7.268f, 22f, 5.799f, 20.813f, 5.367f, 19.199f)
            curveTo(3.459f, 18.896f, 2f, 17.244f, 2f, 15.25f)
            verticalLineTo(15f)
            curveTo(2f, 13.438f, 2.895f, 12.087f, 4.2f, 11.428f)
            curveTo(3.461f, 10.722f, 3f, 9.728f, 3f, 8.625f)
            curveTo(3f, 6.686f, 4.423f, 5.08f, 6.282f, 4.795f)
            curveTo(6.504f, 3.215f, 7.86f, 2f, 9.5f, 2f)
            curveTo(10.505f, 2f, 11.404f, 2.457f, 12f, 3.174f)
            curveTo(12.596f, 2.457f, 13.495f, 2f, 14.5f, 2f)
            close()
            moveTo(9.5f, 3.5f)
            curveTo(8.533f, 3.5f, 7.75f, 4.284f, 7.75f, 5.25f)
            verticalLineTo(5.5f)
            curveTo(7.75f, 5.914f, 7.414f, 6.25f, 7f, 6.25f)
            horizontalLineTo(6.875f)
            curveTo(5.563f, 6.25f, 4.5f, 7.313f, 4.5f, 8.625f)
            curveTo(4.5f, 9.937f, 5.563f, 11f, 6.875f, 11f)
            horizontalLineTo(7.25f)
            curveTo(7.664f, 11f, 8f, 11.336f, 8f, 11.75f)
            curveTo(8f, 12.164f, 7.664f, 12.5f, 7.25f, 12.5f)
            horizontalLineTo(6.875f)
            curveTo(6.847f, 12.5f, 6.818f, 12.498f, 6.79f, 12.497f)
            curveTo(6.777f, 12.498f, 6.763f, 12.5f, 6.75f, 12.5f)
            horizontalLineTo(6f)
            curveTo(4.619f, 12.5f, 3.5f, 13.619f, 3.5f, 15f)
            verticalLineTo(15.25f)
            curveTo(3.5f, 16.631f, 4.619f, 17.75f, 6f, 17.75f)
            curveTo(6.339f, 17.751f, 6.628f, 17.977f, 6.719f, 18.292f)
            lineTo(6.745f, 18.432f)
            horizontalLineTo(6.747f)
            curveTo(6.853f, 19.596f, 7.836f, 20.5f, 8.994f, 20.5f)
            curveTo(10.238f, 20.5f, 11.25f, 19.491f, 11.25f, 18.25f)
            verticalLineTo(5.241f)
            curveTo(11.245f, 4.279f, 10.464f, 3.5f, 9.5f, 3.5f)
            close()
            moveTo(14.5f, 3.5f)
            curveTo(13.536f, 3.5f, 12.755f, 4.279f, 12.75f, 5.241f)
            verticalLineTo(18.25f)
            curveTo(12.75f, 19.491f, 13.762f, 20.5f, 15.006f, 20.5f)
            curveTo(16.164f, 20.5f, 17.147f, 19.596f, 17.253f, 18.432f)
            horizontalLineTo(17.255f)
            lineTo(17.281f, 18.292f)
            curveTo(17.372f, 17.977f, 17.661f, 17.751f, 18f, 17.75f)
            curveTo(19.381f, 17.75f, 20.5f, 16.631f, 20.5f, 15.25f)
            verticalLineTo(15f)
            curveTo(20.5f, 13.619f, 19.381f, 12.5f, 18f, 12.5f)
            horizontalLineTo(17.25f)
            curveTo(17.236f, 12.5f, 17.223f, 12.498f, 17.209f, 12.497f)
            curveTo(17.181f, 12.498f, 17.153f, 12.5f, 17.125f, 12.5f)
            horizontalLineTo(16.75f)
            curveTo(16.336f, 12.5f, 16f, 12.164f, 16f, 11.75f)
            curveTo(16f, 11.336f, 16.336f, 11f, 16.75f, 11f)
            horizontalLineTo(17.125f)
            curveTo(18.437f, 11f, 19.5f, 9.937f, 19.5f, 8.625f)
            curveTo(19.5f, 7.313f, 18.437f, 6.25f, 17.125f, 6.25f)
            horizontalLineTo(17f)
            curveTo(16.586f, 6.25f, 16.25f, 5.914f, 16.25f, 5.5f)
            verticalLineTo(5.25f)
            curveTo(16.25f, 4.284f, 15.467f, 3.5f, 14.5f, 3.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BrainPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Brain, contentDescription = null)
    }
}
