/**
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

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.ReadAloud: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ReadAloud",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.592f, 2.081f)
            curveTo(14.824f, 1.58f, 15.418f, 1.361f, 15.919f, 1.592f)
            curveTo(16.183f, 1.726f, 15.92f, 1.593f, 15.92f, 1.593f)
            lineTo(15.921f, 1.593f)
            lineTo(15.924f, 1.594f)
            lineTo(15.931f, 1.598f)
            lineTo(15.953f, 1.608f)
            curveTo(15.97f, 1.616f, 15.993f, 1.628f, 16.022f, 1.642f)
            curveTo(16.08f, 1.671f, 16.16f, 1.713f, 16.26f, 1.768f)
            curveTo(16.458f, 1.877f, 16.733f, 2.038f, 17.058f, 2.256f)
            curveTo(17.704f, 2.689f, 18.554f, 3.352f, 19.373f, 4.273f)
            curveTo(21.025f, 6.132f, 22.537f, 9.038f, 21.992f, 13.132f)
            curveTo(21.919f, 13.679f, 21.416f, 14.064f, 20.868f, 13.991f)
            curveTo(20.321f, 13.918f, 19.936f, 13.415f, 20.009f, 12.868f)
            curveTo(20.463f, 9.462f, 19.226f, 7.118f, 17.878f, 5.602f)
            curveTo(17.197f, 4.836f, 16.484f, 4.28f, 15.943f, 3.916f)
            curveTo(15.673f, 3.735f, 15.449f, 3.604f, 15.296f, 3.52f)
            curveTo(15.219f, 3.478f, 15.161f, 3.448f, 15.124f, 3.429f)
            curveTo(15.106f, 3.42f, 15.092f, 3.414f, 15.085f, 3.41f)
            lineTo(15.079f, 3.407f)
            curveTo(14.579f, 3.175f, 14.361f, 2.582f, 14.592f, 2.081f)
            close()
            moveTo(9.931f, 4.635f)
            curveTo(9.781f, 4.252f, 9.411f, 4f, 9f, 4f)
            curveTo(8.589f, 4f, 8.22f, 4.252f, 8.07f, 4.635f)
            lineTo(2.57f, 18.634f)
            curveTo(2.368f, 19.148f, 2.621f, 19.729f, 3.135f, 19.931f)
            curveTo(3.649f, 20.132f, 4.229f, 19.879f, 4.431f, 19.365f)
            lineTo(6.146f, 15f)
            horizontalLineTo(11.854f)
            lineTo(13.569f, 19.365f)
            curveTo(13.771f, 19.879f, 14.352f, 20.132f, 14.866f, 19.931f)
            curveTo(15.38f, 19.729f, 15.633f, 19.148f, 15.431f, 18.634f)
            lineTo(9.931f, 4.635f)
            close()
            moveTo(11.069f, 13f)
            horizontalLineTo(6.932f)
            lineTo(9f, 7.735f)
            lineTo(11.069f, 13f)
            close()
            moveTo(15.447f, 5.606f)
            curveTo(14.953f, 5.359f, 14.353f, 5.559f, 14.106f, 6.053f)
            curveTo(13.859f, 6.547f, 14.059f, 7.148f, 14.553f, 7.395f)
            curveTo(14.844f, 7.54f, 15.345f, 7.971f, 15.78f, 8.658f)
            curveTo(16.202f, 9.327f, 16.5f, 10.144f, 16.5f, 11f)
            curveTo(16.5f, 11.552f, 16.948f, 12f, 17.5f, 12f)
            curveTo(18.052f, 12f, 18.5f, 11.552f, 18.5f, 11f)
            curveTo(18.5f, 9.686f, 18.048f, 8.504f, 17.471f, 7.59f)
            curveTo(16.905f, 6.695f, 16.157f, 5.96f, 15.447f, 5.606f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ReadAloudPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ReadAloud, contentDescription = null)
    }
}
